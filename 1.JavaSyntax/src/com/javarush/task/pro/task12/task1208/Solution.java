package com.javarush.task.pro.task12.task1208;

/* 
��������� ��������
*/

public class Solution {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', '�');
        compare('�', '�');
        compare('�', '�');
    }

    public static void compare(Character first, Character second) {
        if (first.equals(second)) {
            System.out.println("�����");
        } else if (first > second) {
            System.out.println("������");
        } else if (first < second) {
            System.out.println("������");
        } else {
            System.out.println("� ��� ����� ����� ����???");
        }
    }
}
