package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) {
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ) {
            ZipFileManager zipFileManager = new ZipFileManager(Paths.get(console.readLine()));
            zipFileManager.createZip(Paths.get(console.readLine()));

        } catch(Exception e) {

        }
    }
}
