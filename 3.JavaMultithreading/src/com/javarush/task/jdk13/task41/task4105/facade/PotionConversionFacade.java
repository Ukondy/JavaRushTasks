package com.javarush.task.jdk13.task41.task4105.facade;

import com.javarush.task.jdk13.task41.task4105.Solution;
import com.javarush.task.jdk13.task41.task4105.alchemy_library.*;

import static com.javarush.task.jdk13.task41.task4105.alchemy_library.Type.MANA;
import static com.javarush.task.jdk13.task41.task4105.alchemy_library.Type.STAMINA;

public class PotionConversionFacade {


    public String covertPotion(String potionName, String covertTo) {
        System.out.println("PotionConversionFacade:");
        Potion potion = new Potion(potionName);
        Type type = Type.valueOf(covertTo.toUpperCase());
        Essence sourceEssence = EssenceFactory.extract(potion);
        Essence destinationEssence = switch (type) {
            case MANA -> new ManaEssenceConverter();
            case STAMINA -> new StaminaEssenceConverter();
            default -> new HealingEssenceConverter();
        };
        Potion portion = Extractor.extractPortion(potion, sourceEssence);
        Potion intermediateResult = Extractor.convert(portion, destinationEssence);
        Potion result = new Finalizator().fix(intermediateResult);
        System.out.println("Client Code: conversion completed.");

        return result.getName();
    }
}
