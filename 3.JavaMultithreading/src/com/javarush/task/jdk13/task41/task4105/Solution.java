package com.javarush.task.jdk13.task41.task4105;

import com.javarush.task.jdk13.task41.task4105.alchemy_library.*;
import com.javarush.task.jdk13.task41.task4105.facade.PotionConversionFacade;

import static com.javarush.task.jdk13.task41.task4105.alchemy_library.Type.MANA;
import static com.javarush.task.jdk13.task41.task4105.alchemy_library.Type.STAMINA;

/* 
Алхимическая библиотека
*/

public class Solution {

    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";

    public static void main(String[] args) {
        PotionConversionFacade potionConversionFacade = new PotionConversionFacade();
        System.out.println(potionConversionFacade.covertPotion(potionName, type));
    }
}
