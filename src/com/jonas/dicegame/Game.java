package com.jonas.dicegame;

import java.io.IOException;
import java.util.Random;

/**
 * <font color = #d77048>
 * <i>The `Game` class represents a dice game application. It manages the game flow,
 *    player interactions, rounds, and scoring.</i>
 */
public class Game {

    StringManipulation output = new StringManipulation();

    private InputProcessing sc;
    private Setup setup;
    private Table table;
    private Scoring finalScore;
    private Dice d6;
    private boolean restart;

    /**
     * <font color = #d77048>
     * <i>Initiate a new game</i>
     */
    public void newGame() throws InterruptedException {

        introMessage();

        loop();
    }

    /**
     * <font color = #d77048>
     * <i>Outputs the intro message to player</i>     *
     * @throws InterruptedException
     */
    private void introMessage() throws InterruptedException {

        String intro = """
        Welcome!
        Due to extreme graphics and advanced interactive features,
        we would strongly suggest you to shut down all other heavy CPU activities running!
        Before we get rollin, we must setup the game!
        """;

        output.delayOutputColor(intro);

        System.out.println();
    }

    /**
     * <font color = #d77048>
     * <i>Initiates game loop</i>
     * @throws InterruptedException
     */
    private void loop() throws InterruptedException {
        do {
            instantiation();
            roundIterator();
            declareWinners();
            newOrQuit();
        } while (restart);

    }

    /**
     * <font color = #d77048>
     * <i>Resets the game</i>
     */
    private void instantiation() {

        this.sc = new InputProcessing();
        this.setup = new Setup();
        this.table = new Table(setup.getNumPlayers());
        this.finalScore = new Scoring(setup.getNumPlayers(), table.getTable());
        this.d6 = new Dice();

    }

    /**
     * <font color = #d77048>
     * <i>Iterates accordingly to rounds in setup</i>
     * @throws InterruptedException
     */
    private void roundIterator() throws InterruptedException {
        for (int i = 0; i < setup.getRounds(); i++) {
            logics();
        }
    }

    /**
     * <font color = #d77048>
     * <i>User gets options, new game or quit</i>
     */
    private void newOrQuit() {
        int playerChoice;
        do {
            System.out.println("Do you wish to play again?");
            System.out.println();
            System.out.println("1. New Game");
            System.out.println("2. Quit");

            playerChoice = sc.tryNextInt();

            if (playerChoice != 1 && playerChoice != 2) System.out.println("Please pick one of the numbers");

        } while (playerChoice != 1 && playerChoice != 2);

        switch (playerChoice) {
            case 1 -> this.restart = true;
            case 2 -> this.restart = false;
            default -> System.out.println("something wrong when choosing new game");
        }
    }

    /**
     * <font color = #d77048>
     * <i>The logics for one turn. Compiler iterates through all players</i>
     * @throws InterruptedException
     */
    private void logics() throws InterruptedException {
        for (int i = 0; i < table.getTable().length; i++) {
            d6.roll(setup.getNumDice());
            int sum = d6.sumUpRoll();
            // add score
            table.getTable()[i].addTotalScore(sum);
            //print roll + roll total
            printRolls(i);
            printCurrentScore(i);
        }
    }

    /**
     * <font color = #d77048>
     *      <i>Prints the dice rolls and scores for a player's turn.</i>
     * @param i The index of the current player
     * @throws InterruptedException
     */
    private void printRolls(int i) throws InterruptedException {

        System.out.print(table.getTable()[i].getColor() + table.getTable()[i].getName() + "\u001B[0m");
        waitForEnter();
        output.delayOutputColor("Rolls... ");
        output.delayOutputColor(d6.getStringSet() + " = " + d6.sumUpRoll());
        System.out.println();

    }

    /**
     * <font color = #d77048>
     *     <i>Prints the current score for a player.</i>
     * @param i The index of the current player
     * @throws InterruptedException
     */
    private void printCurrentScore(int i) throws InterruptedException {
        output.delayOutputColor("Current Score: ");
        System.out.println(table.getTable()[i].getTotalScore());
        System.out.println();
    }

    /**
     * <font color = #d77048>
     * <i>Waits for the player to press the Enter key.</i>
     */
    private void waitForEnter() {
        try {
            System.in.read();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    /**
     * <font color = #d77048>
     * <i>Sorts player accordingly to their final scores, and announcing placings</i>
     */
    private void declareWinners() {
        table.sortScoreDescending();
        finalScore.assignMedals();
        finalScore.announceWinners();
    }

    /**
     * <font color = #d77048>
     *     <i>Generates a random number.
     *     The values range varies depending on the argument value</i>
     * @param randomRange is the max value of a random number
     * @return  A random number 1 -> randomRange
     */
    public int genNum(int randomRange){
        Random rand = new Random();
        return rand.nextInt(randomRange) + 1;
    }

}