package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;

import java.nio.file.Paths;

public abstract class ZipCommand implements Command {
    public ZipFileManager getZipFileManager() throws Exception {
        String path;

        ConsoleHelper.writeMessage("Введите имя файла");
        path = ConsoleHelper.readString();

        return new ZipFileManager(Paths.get(path));
    }
}
