package com.jonas.dicegame;
import java.util.Arrays;

/**
 * <font color = #d77048>
 * <i>The `Dice` class represents a set of dice used in a dice game.
 *    It allows you to roll the dice, get the string representation of the dice rolls,
 *    calculate the sum of the rolls, and sort the rolls in descending order.</i>
 */
public class Dice {

    private int[] setOfDice;

    /**
     * <font color = #d77048>
     *     <i>Roll dice</i>
     * @param numDice number of dice to roll
     */
    public void roll(int numDice){
        Game game = new Game();
        this.setOfDice = new int[numDice];
        final int numSides = 6;
        for (int i = 0; i < numDice; i++) this.setOfDice[i] = game.genNum(numSides);
    }

    /**
     * <font color = #d77048>
     *     <i>Get the String value of the dice roll</i>
     * @return The array of dice in type String
     */
    public String getStringSet(){
        return Arrays.toString(getSetOfDice());
    }

    /**
     * <font color = #d77048>
     *     <i>Get the set of dice</i>
     * @return array of current rolls
     */
    public int[] getSetOfDice() {
        return setOfDice;
    }

    /**
     * <font color = #d77048>
     *     <i>sums up array of dice</i>
     * @return total of one roll
     */
    public int sumUpRoll(){
        int sum = 0;
        for (int value: getSetOfDice()) {
            sum += value;
        }
        return sum;
    }

    public void setSetOfDice(int[] setOfDice) {
        this.setOfDice = setOfDice;
    }
}
