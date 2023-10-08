package com.jonas.dicegame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    public void roll() {

        Dice dice = new Dice();
        int numOfDice = 3;
        dice.roll(numOfDice);
        int[] rolls = dice.getSetOfDice();

        // Is the number of dice same as number of the length of array??
        assertEquals(numOfDice, rolls.length);

        for (int roll: rolls) {

            // Check if all rolls in array is in the constricted range.
            assertTrue(roll >= 1 && roll <= 6);
        }
    }

    @Test
    public void sumUpRoll() {

        Dice dice = new Dice();
        int[] simulateRoll = {6, 4, 5, 3, 2};
        dice.setSetOfDice(simulateRoll);

        //Is 'sumUpRoll' returning a correct sum?
        assertEquals(20 ,dice.sumUpRoll());
    }
}