
package com.jonas.dicegame;
/**
 * <font color = #d77048>
 * <i>### Define Class</i>
 */
public class Game {

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
    public Game() {
        loop();
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
     * <i>Initiates game loop</i>
     */
    private void loop() {
        do {
            instantiation();
            roundIterator();
            declareWinners();
            newOrQuit();
        } while (restart);
    }

    /**
     * <font color = #d77048>
     * <i>Iterates accordingly to rounds in setup</i>
     */
    private void roundIterator(){
        for (int i = 0; i < setup.getRounds(); i++) {
            logics();
        }
    }

    /**
     * <font color = #d77048>
     * <i>User gets options, new game or quit</i>
     */
    private void newOrQuit(){
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
            case 1: this.restart = true; break;
            case 2: this.restart = false; break;
            default: System.out.println("something wrong when choosing new game"); break;
        }
    }
    
    /**
     * <font color = #d77048>
     * <i>The logics for one turn. Compiler iterates through all players</i>
     */
    private void logics() {
        for (int i = 0; i < table.getTable().length; i++) {
            d6.roll(setup.getNumDice());
            int sum = d6.sumUpRoll();
            // add score
            table.getTable()[i].addTotalScore(sum);
            //print roll + roll total
            System.out.println(table.getTable()[i].getName() + " Rolls... ");
            System.out.println(d6.getStringSet() + " = " + d6.sumUpRoll());
            //print player total
            System.out.println("Current Score: " + table.getTable()[i].getTotalScore());
            System.out.println();
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