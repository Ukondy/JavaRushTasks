package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);
            InputStream inputStream = Files.newInputStream(Path.of(scanner.nextLine()));
            OutputStream outputStream = Files.newOutputStream(Path.of(scanner.nextLine()))
            ) {
            byte[] bytesInput = inputStream.readAllBytes();
            byte[] bytesOutput = new byte[bytesInput.length];
            for (int i = 0; i < bytesInput.length; i+=2) {
                if(i < bytesInput.length -1) {
                    bytesOutput[i] = bytesInput[i + 1];
                    bytesOutput[i + 1] = bytesInput[i];
                } else {
                    bytesOutput[i] = bytesInput[i];
                }
            }
            outputStream.write(bytesOutput);
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}

