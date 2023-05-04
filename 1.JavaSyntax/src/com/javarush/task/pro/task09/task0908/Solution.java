package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if(binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) return "";
        String hexNumber = "";
        while(binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        while(binaryNumber.length() > 0) {
            String fourBit = binaryNumber.substring(0, 4);
            String oneHex = "";
            switch (fourBit) {
                case "0000":
                    oneHex = "0";
                    break;
                case "0001":
                    oneHex = "1";
                    break;
                case "0010":
                    oneHex = "2";
                    break;
                case "0011":
                    oneHex = "3";
                    break;
                case "0100":
                    oneHex = "4";
                    break;
                case "0101":
                    oneHex = "5";
                    break;
                case "0110":
                    oneHex = "6";
                    break;
                case "0111":
                    oneHex = "7";
                    break;
                case "1000":
                    oneHex = "8";
                    break;
                case "1001":
                    oneHex = "9";
                    break;
                case "1010":
                    oneHex = "a";
                    break;
                case "1011":
                    oneHex = "b";
                    break;
                case "1100":
                    oneHex = "c";
                    break;
                case "1101":
                    oneHex = "d";
                    break;
                case "1110":
                    oneHex = "e";
                    break;
                case "1111":
                    oneHex = "f";
                    break;
                default:
                    return "";
            }
            hexNumber += oneHex;
            int index = binaryNumber.length();
            binaryNumber = binaryNumber.substring(4, index);
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        if(hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) return "";
        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            String oneHex = String.valueOf(hexNumber.charAt(i));
            String fourBit = "";
            switch (oneHex) {
                case "0":
                    fourBit = "0000";
                    break;
                case "1":
                    fourBit = "0001";
                    break;
                case "2":
                    fourBit = "0010";
                    break;
                case "3":
                    fourBit = "0011";
                    break;
                case "4":
                    fourBit = "0100";
                    break;
                case "5":
                    fourBit = "0101";
                    break;
                case "6":
                    fourBit = "0110";
                    break;
                case "7":
                    fourBit = "0111";
                    break;
                case "8":
                    fourBit = "1000";
                    break;
                case "9":
                    fourBit = "1001";
                    break;
                case "a":
                    fourBit = "1010";
                    break;
                case "b":
                    fourBit = "1011";
                    break;
                case "c":
                    fourBit = "1100";
                    break;
                case "d":
                    fourBit = "1101";
                    break;
                case "e":
                    fourBit = "1110";
                    break;
                case "f":
                    fourBit = "1111";
                    break;
                default:
                    return "";
            }
            binaryNumber += fourBit;
        }
        return binaryNumber;
    }
}
