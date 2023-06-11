package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("get server's port");
        int port = ConsoleHelper.readInt();

        try(ServerSocket serverSocket = new ServerSocket(port);
        ) {
            ConsoleHelper.writeMessage("server ready");
            while(true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Exception");
        }
    }

    public static void sendBroadcastMessage(Message message) {
        for(Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("sending message was failed: " + connection.getRemoteSocketAddress());
            }
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while(true) {
                connection.send(new Message(MessageType.NAME_REQUEST, "Enter your name"));
                Message message = connection.receive();
                String userName = message.getData();
                if (message.getType().equals(MessageType.USER_NAME) && !Objects.isNull(userName) && !userName.isEmpty() && !connectionMap.containsKey(userName)) {
                    connectionMap.put(userName, connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED, "welcome to family " + userName));
                    return userName;
                } else {
                    ConsoleHelper.writeMessage("Enter your name again");
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for(String name : connectionMap.keySet()) {
                if(!name.equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                }
            }
        }

        @Override
        public void run() {
            super.run();
        }
    }
}