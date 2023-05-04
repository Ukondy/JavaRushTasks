package com.javarush.task.pro.task13.task1316;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] array = JavarushQuest.values();
        for (JavarushQuest jQ : array) {
            System.out.println(jQ.ordinal());
        }
    }
}
