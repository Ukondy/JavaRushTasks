package com.javarush.task.pro.task12.task1206;

/*
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int cd = 0;
        for (char digit : string.toCharArray()) {
            if(Character.isDigit(digit)) {
                cd++;
            }
        }
        return cd;
    }

    public static int countLetters(String string) {
        int cl = 0;
        for (char letter : string.toCharArray()) {
            if(Character.isLetter(letter)) {
                cl++;
            }
        }
        return cl;
    }

    public static int countSpaces(String string) {
        int cl = 0;
        for (char space : string.toCharArray()) {
            if(Character.isSpaceChar(space)) {
                cl++;
            }
        }
        return cl;
    }
}
