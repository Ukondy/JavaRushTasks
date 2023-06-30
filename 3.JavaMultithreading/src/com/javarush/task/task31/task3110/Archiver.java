package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.IOException;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) {
        try {
            ZipFileManager zipFileManager = new ZipFileManager(Paths.get(ConsoleHelper.readString()));
            zipFileManager.createZip(Paths.get(ConsoleHelper.readString()));

        } catch(Exception e) {

        }

        ExitCommand exitCommand = new ExitCommand();
        try {
            exitCommand.execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
