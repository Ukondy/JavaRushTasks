package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        List<String> list = Files.readAllLines(Paths.get(fileName));
        for (String str : list) {
            System.out.println(str.replaceAll("[,.\\s]", ""));
        }
        System.out.println();
    }
}

