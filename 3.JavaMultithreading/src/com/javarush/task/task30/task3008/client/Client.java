package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;

import java.io.IOException;
import static com.javarush.task.task30.task3008.MessageType.*;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    protected String getServerAddress() {
        ConsoleHelper.writeMessage("get server address");
        return ConsoleHelper.readString();
    }

    protected int getServerPort() {
        ConsoleHelper.writeMessage("get server port");
        return ConsoleHelper.readInt();
    }
    protected String getUserName () {
        ConsoleHelper.writeMessage("get user name");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("fail in sending message");
            clientConnected = false;
        }
    }

    public void run() {
        SocketThread thread = getSocketThread();
        thread.setDaemon(true);

        thread.start();
        try {
            synchronized (this) {
                wait();
            }
        } catch(InterruptedException e) {
            ConsoleHelper.writeMessage("was fail in process");
            return;
        }

        if(clientConnected) {
            ConsoleHelper.writeMessage("client connection is done");
            while(clientConnected) {
                String message = ConsoleHelper.readString();

                if(message.equals("exit")) {
                    break;
                }

                if(shouldSendTextFromConsole()) sendTextMessage(message);
            }
        } else {
            ConsoleHelper.writeMessage("something went wrong in connection");
        }
    }

    public class SocketThread extends Thread {

        @Override
        public void run() {
            super.run();
        }

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage("The member " + userName + " added");
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage("The member " + userName + " deleted");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while(true) {
                Message message = connection.receive();

                if(message.getType() == NAME_REQUEST) {
                    connection.send(new Message(USER_NAME, getUserName()));
                } else if (message.getType() == NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true);
                    return;
                } else {
                    throw new IOException();
                }
            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            while(true) {
                Message message = connection.receive();
                if (message.getType() == TEXT) {
                    processIncomingMessage(message.getData());
                } else if (message.getType() == USER_ADDED) {
                    informAboutAddingNewUser(message.getData());
                } else if (message.getType() == USER_REMOVED) {
                    informAboutDeletingNewUser(message.getData());
                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }
    }
}
