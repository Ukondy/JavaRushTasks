package com.javarush.task.jdk13.task41.task4107;

import com.javarush.task.jdk13.task41.task4107.factory.DotNetCourse;
import com.javarush.task.jdk13.task41.task4107.factory.JavaRush;
import com.javarush.task.jdk13.task41.task4107.factory.KotlinCourse;
import com.javarush.task.jdk13.task41.task4107.factory.ProgrammingCourse;

import java.util.Scanner;

/* 
Кузница кадров
*/

public class Solution {

    private static ProgrammingCourse course;

    public static void main(String[] args) {
        choose(new Scanner(System.in).nextLine());
        startLearningProcess();
    }

    static void choose(String direction) {
        if (direction.equals("web")) {
            course = new JavaRush();
        } else if (direction.equals("android")) {
            course = new KotlinCourse();
        } else {
            course = new DotNetCourse();
        }
    }

    static void startLearningProcess() {
        course.educateStudent();
    }
}
