package com.jonas.dicegame;

import java.util.Arrays;
import java.util.Random;

/**
 * //Todo - define Dice class
 */
public class Dice {

    final int numSides = 6;
    int sumOfSet;
    int value;
    int[] set;

    /**
     * Roll dice
     * @param numDice number of dice to roll
     */
    public void roll(int numDice){
        this.set = new int[numDice];
        for (int i = 0; i < numDice; i++) this.set[i] = genNum();
    }
    /**
     * Generates a random number.
     * The values range varies depending on the dice number of sides
     * @return A random number
     */
    public int genNum(){
        Random rand = new Random();
        return rand.nextInt(numSides) + 1;
    }
    /**
     * sorts set of dice in descending order
     */
    public void sortSetDesc(){
        Arrays.sort(set);
        //System.out.println("[DEBUG] Score Descending  [DEBUG]");
    }
    /**
     * @return The array of dice in type String
     */
    public String printRoll(){
        return Arrays.toString(getSet());
    }
    /**
     * @return An array of dice values
     */
    public int[] getSet() {
        return set;
    }
    /**
     * sums up array of dice
     * @return total of one roll
     */
    public int sumUpRoll(){
        int sum = 0;
        for (int value:getSet()) {
            sum += value;
        }
        return sum;
    }

}
