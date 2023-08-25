package com.javarush.task.jdk13.task41.task4104.creature;

import com.javarush.task.jdk13.task41.task4104.move.MoveLogic;
import com.javarush.task.jdk13.task41.task4104.sound.SoundLogic;

public class Cow extends Creature{
    public Cow(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    public void giveMilk() {
        System.out.println(getName() + " даёт молоко.");
    }

    @Override
    public String getName() {
        return "Корова";
    }
}
