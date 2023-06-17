package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class BotClient extends Client {

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return "date_bot_" + (int) (Math.random() * 100);
    }

    public class BotSocketThread extends SocketThread {

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (!message.contains(":")) {
                return;
            }
            String[] pair = message.split(": ");
            String format = null;
            if(pair[1].equals("дата")) {
                format = "d.MM.yyyy";
            } else if(pair[1].equals("день")) {
                format = "d";
            }else if(pair[1].equals("месяц")) {
                format = "MMMM";
            }else if(pair[1].equals("год")) {
                format = "yyyy";
            }else if(pair[1].equals("время")) {
                format = "H:mm:ss";
            }else if(pair[1].equals("час")) {
                format = "H";
            }else if(pair[1].equals("минуты")) {
                format = "m";
            }else if(pair[1].equals("секунды")) {
                format = "s";
            }

            if(format != null) {
                sendTextMessage("Информация для " + pair[0] + ": " + new SimpleDateFormat(format).format(new GregorianCalendar().getTime()));
            }
        }
    }
}
