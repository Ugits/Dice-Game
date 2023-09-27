package com.jonas.dicegame;

public class Game {

    UserInput sc;
    Setup setup;
    Table table;
    Scoring finalScore;
    Dice d6;


    /**
     *  Creates object that initiate a new game
     */
    public Game() {
        loop();
    }

    /**
     * Initiates game loop
     */
    public void loop(){

        do {
            instantiation();
            for (int i = 0; i < setup.getRounds(); i++) logics();
            declareWinners();
            //TODO Options - new game, quit (if else)
        } while (true);
    }

    /**
     * Resets the game
     */
    public void instantiation(){
        this.sc = new UserInput();
        this.setup = new Setup();
        this.table = new Table(setup.getNumPlayers());
        this.finalScore = new Scoring(setup.getNumPlayers(), table.getTable());
        this.d6 = new Dice();
    }
    /**
     * The logics for one turn.
     * Compiler iterates through all players
     */
    public void logics(){
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
    public void declareWinners(){
        table.sortScoreDescending();
        finalScore.assignMedals();
        finalScore.announceWinners();
    }




    //todo Turn
    //  * roll dice
    //  * sum score
    //  * add score
    //TODO score
    //  * compare score
    //  * sort into gold, silver and bronze
    //  * declare winner
    //  * declare more than 1 winner // compare winner to next in table
    //  * 1,2,3 place?
    //  * for loop --> round
    //  ending options
    //  play again?
    //  New game
    //

    // Assign score for compare
    // table.players[1].setTotalScore(5);

}



//