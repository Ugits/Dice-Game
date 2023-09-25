package com.jonas.dicegame;

import java.util.Arrays;
import java.util.Random;

public class Dice {

    private final int numSides = 6;
    private int value;
    private int[] set;
    private int totalSum;

    public void roll(int numOfDice){
        this.set = new int[numOfDice];
        for (int i = 0; i < numOfDice; i++) this.set[i] = genNum();
    }

    public int genNum(){
        Random rand = new Random();
        return rand.nextInt(numSides) + 1;
    }

    public void sortSetDesc(){
        Arrays.sort(set);
        System.out.println("[DEBUG] Score Descending  [DEBUG]");
    }

    public void printSet(){
        System.out.println(Arrays.toString(set));
    }
}
