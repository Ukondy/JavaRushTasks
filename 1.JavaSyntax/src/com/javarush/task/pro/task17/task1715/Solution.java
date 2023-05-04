package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Вилларибо и Виллабаджо.
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        Organ organ = new Organ();
        Piano piano = new Piano();
        orchestra.add(organ);
        orchestra.add(piano);
        orchestra.add(piano);
        orchestra.add(piano);
    }

    public static void createStringedOrchestra() {
        Violin violin = new Violin();
        Guitar guitar = new Guitar();
        orchestra.add(violin);
        orchestra.add(violin);
        orchestra.add(guitar);
    }

    public static void playOrchestra() {
        for (MusicalInstrument musicalInstrument : orchestra) {
            musicalInstrument.play();
        }
    }
}
