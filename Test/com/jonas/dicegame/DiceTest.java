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

        // Is the number of dice same att number of result in array??
        assertEquals(numOfDice, rolls.length);

        for (int roll: rolls) {
            assertTrue(roll >= 1 && roll <= 6);
        }
    }

    @Test
    public void sumUpRoll() {
        Dice dice = new Dice();
        int[] simulateRoll = {6, 4, 5, 3, 2};
        dice.setSetOfDice(simulateRoll);

        assertEquals(20 ,dice.sumUpRoll());
    }
}