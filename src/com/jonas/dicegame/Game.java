package com.jonas.dicegame;

public class Game {

    UserInput sc;
    Setup setup;
    Table table;
    Scoring finalScore;
    Dice d6;
    boolean restart;
    int playerChoice;
    /**
     * Creates object that initiate a new game
     */
    public Game() {
        loop();
    }
    /**
     * Initiates game loop
     */
    public void loop() {
        do {
            instantiation();
            roundIterator();
            declareWinners();
            newOrQuit();
        } while (restart);
    }
    public void roundIterator(){
        for (int i = 0; i < setup.getRounds(); i++) {
            logics();
        }
    }
    public void newOrQuit(){
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
     * <hr width="100%" size="1" />
     * <table width="200" border="0">
     * <tr>
     * <td>
     * <center>
     * <font color = #f1C651>
     * <a href="https://www.github.com/Ugits/">
     * <img style=img-align:center; src="https://avatars.githubusercontent.com/u/143827138?s=96&v=4"  width="41" height="41" border="2" alt="DO NOT PRESS!" />
     * </a>
     * </center>
     * </td>
     * <td>
     * <font color = #f1C651>
     * <center><i>Resets the game</i></center>
     * </td>
     * </tr>
     * </table>
     * <hr width="100%" size="3" />
     */
    public void instantiation() {
        this.sc = new UserInput();
        this.setup = new Setup();
        this.table = new Table(setup.getNumPlayers());
        this.finalScore = new Scoring(setup.getNumPlayers(), table.getTable());
        this.d6 = new Dice();
    }
    /**
     * <hr width="100%" size="1" />
     * <p>
     * <table width="300" border="0" border-spacing: 30px;>
     * <tr>
     * <td>
     * <center>
     * <font color = #f1C651>
     * <a href="https://www.github.com/Ugits/">
     * <img src="https://avatars.githubusercontent.com/u/143827138?s=96&v=4" width="41" height="41" border="2" alt="DO NOT PRESS!" />
     * </a>
     * </center>
     * </td>
     * <td>
     * <font color = #f1C651>
     * <p style="text-align:left; text-indent:10px;"><i>The logics for one turn. Compiler iterates through all players</i></p>
     * </td>
     * </tr>
     * </table>
     * <p>
     * <hr width="100%" size="3" />
     */
    public void logics() {
        for (int i = 0; i < table.getTable().length; i++) {
            d6.roll(setup.getNumDice());
            int sum = d6.sumUpRoll();
            // add score
            table.getTable()[i].addTotalScore(sum);
            //print roll + roll total
            System.out.println(table.getTable()[i].getName() + " Rolls... ");
            System.out.println(d6.printRoll() + " = " + d6.sumUpRoll());
            //print player total
            System.out.println("Current Score: " + table.getTable()[i].getTotalScore());
            System.out.println();
        }
    }
    /**
     * sorts player accordingly to their final scores, and announcing placings
     */
    public void declareWinners() {
        table.sortScoreDescending();
        finalScore.assignMedals();
        finalScore.announceWinners();
    }
}