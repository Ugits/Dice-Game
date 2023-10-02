
package com.jonas.dicegame;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * <font color = #d77048>
 * <i>### Define Class</i>
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
     * <i>Creates object that initiate a new game</i>
     */
    public Game() throws InterruptedException {
        introMessage();

        loop();
    }

    /**
     * <font color = #d77048>
     * <i>Outputs the intro message to player</i>
     *
     * @throws InterruptedException
     */
    public void introMessage() throws InterruptedException {

        String intro = """
                Welcome!""";
        //Before we start the game.
        //Due to extreme graphics and advanced interactive features,
        //we would strongly suggest you to shut down all other heavy CPU activities running!
        //Before we get rollin, we must setup the game!
        //""";

        output.delayOutputColor(intro);

        System.out.println();
    }

    /**
     * <font color = #d77048>
     * <i>Initiates game loop</i>
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
        this.table = new Table(setup.getNumPlayers(), output);
        this.finalScore = new Scoring(setup.getNumPlayers(), table.getTable());
        this.d6 = new Dice();

    }

    /**
     * <font color = #d77048>
     * <i>Iterates accordingly to rounds in setup</i>
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
            case 1:
                this.restart = true;
                break;
            case 2:
                this.restart = false;
                break;
            default:
                System.out.println("something wrong when choosing new game");
                break;
        }
    }

    /**
     * <font color = #d77048>
     * <i>The logics for one turn. Compiler iterates through all players</i>
     */
    private void logics() throws InterruptedException {
        for (int i = 0; i < table.getTable().length; i++) {
            d6.roll(setup.getNumDice());
            int sum = d6.sumUpRoll();
            // add score
            table.getTable()[i].addTotalScore(sum);
            //print roll + roll total
            printRolls(i);
        }
    }

    public void printRolls(int i) throws InterruptedException {

        System.out.print(table.getTable()[i].getColor() + table.getTable()[i].getName() + "\u001B[0m");
        waitForEnter();
        output.delayOutputColor("Rolls... ");
        output.delayOutputColor(d6.getStringSet() + " = " + d6.sumUpRoll());
        System.out.println();
        output.delayOutputColor("Current Score: ");
        System.out.println(table.getTable()[i].getTotalScore());
        System.out.println();
    }

    public void waitForEnter() {
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
}