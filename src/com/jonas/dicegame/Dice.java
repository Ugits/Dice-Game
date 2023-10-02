package com.jonas.dicegame;

import java.util.Arrays;
import java.util.Random;

/**
 * <font color = #d77048>
 * <i>### Define Class</i>
 */
public class Dice {

    private final int numSides = 6;
    private int[] set;

    /**
     * <font color = #d77048>
     *     <i>Roll dice</i>
     * @param numDice number of dice to roll
     */
    public void roll(int numDice){
        this.set = new int[numDice];
        for (int i = 0; i < numDice; i++) this.set[i] = genNum();
    }

    /**
     * <font color = #d77048>
     *     <i>Generates a random number.
     *     The values range varies depending on the dice number of sides</i>
     * @return A random number
     */
    private int genNum(){
        Random rand = new Random();
        return rand.nextInt(numSides) + 1;
    }

    /**
     * <font color = #d77048>
     *     <i>sorts set of dice in descending order</i>
     */
    private void sortSetDesc(){
        Arrays.sort(set);
        //System.out.println("[DEBUG] Score Descending  [DEBUG]");
    }

    /**
     * <font color = #d77048>
     *     <i>Get the String value of the dice roll</i>
     * @return The array of dice in type String
     */
    public String getStringSet(){
        return Arrays.toString(getSet());
    }

    /**
     * <font color = #d77048>
     *     <i>Get the set of dice</i>
     * @return array of current rolls
     */
    private int[] getSet() {
        return set;
    }

    /**
     * <font color = #d77048>
     *     <i>sums up array of dice</i>
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
