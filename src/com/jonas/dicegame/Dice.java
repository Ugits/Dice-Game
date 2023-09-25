package com.jonas.dicegame;

import java.util.Arrays;
import java.util.Random;

public class Dice {

    private final int numSides = 6;
    int sumOfSet;
    private int value;
    private int[] set;


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

    public void printDice(){
        System.out.println(Arrays.toString(set));
    }

    public int[] getSet() {
        return set;
    }

    public int sumUpRoll(){
        int sum = 0;
        for (int value:getSet()) {
            sum += value;
        }
        return sum;
    }

}