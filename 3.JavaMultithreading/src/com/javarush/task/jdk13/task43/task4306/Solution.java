package com.javarush.task.jdk13.task43.task4306;

/* 
В поиске ботана
*/

//import org.apache.commons.lang3.ObjectUtils;

import org.apache.commons.lang3.ObjectUtils;

public class Solution {

    public static void main(String[] args) {
        Student studentOne = new Student("Joe",10, 8, 7, 7, 5, 6, 9);
        Student studentTwo = new Student("Jane",8, 9, 5, 6, 7, 7, 8);

        String result = compareStudentGrades(studentOne, studentTwo);
        System.out.println(result);
    }

    public static String compareStudentGrades(Student studentOne, Student studentTwo) {
        if(studentOne == null || studentTwo == null) return "Make sure there are no null objects";
        int result = 0;
        result += ObjectUtils.compare(studentOne.getChemistryScore(), studentTwo.getChemistryScore());
        result += ObjectUtils.compare(studentOne.getBiologyScore(), studentTwo.getBiologyScore());
        result += ObjectUtils.compare(studentOne.getEnglishScore(), studentTwo.getEnglishScore());
        result += ObjectUtils.compare(studentOne.getHistoryScore(), studentTwo.getHistoryScore());
        result += ObjectUtils.compare(studentOne.getGeographyScore(), studentTwo.getGeographyScore());
        result += ObjectUtils.compare(studentOne.getMathScore(), studentTwo.getMathScore());
        result += ObjectUtils.compare(studentOne.getPhysicsScore(), studentTwo.getPhysicsScore());

        return result == 0 ? "Student grades scores are equal" :
                (result > 0 ? studentOne.getName() : studentTwo.getName()) + " has a higher grades score";
    }
}


