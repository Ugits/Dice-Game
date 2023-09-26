package com.jonas.dicegame;

public class Game {

    UserInput sc;
    Setup setup;
    Table table;
    Scoring finalScore;
    Dice d6;


    int currentRound = 0;

    public Game() {
        loop();
    }

    public void loop(){

        instantiation();

        /** //GameLoop

         do {
         currentRound++;
         System.out.println("Round " + currentRound + "!");
         }while (currentRound <= setupRounds);
         */


        for (int i = 0; i < setup.getRounds(); i++) {
            logics(table,d6,setup);
        }

        // Sort by score, descending,  and Print table
        table.sortScoreDescending();
        //assign medals
        finalScore.assignMedals();
        //announce the winners
        finalScore.announceWinners();
    }

    public void instantiation(){
        this.sc = new UserInput();
        this.setup = new Setup();
        this.table = new Table(setup.numPlayers);
        this.finalScore = new Scoring(setup.numPlayers, table.getPlayerTable());
        this.d6 = new Dice();
    }

    public void logics(Table table, Dice d6, Setup setup){
        for (int i = 0; i < table.getPlayerTable().length; i++) {
            //roll
            d6.roll(setup.getNumDice());
            //sum roll
            int sum = d6.sumUpRoll();
            // add score
            table.getPlayerTable()[i].addTotalScore(sum);
            //print roll + roll total
            System.out.println(table.getPlayerTable()[i].getName() + " Rolls... ");
            System.out.println(d6.printRoll() + " = " + d6.sumUpRoll());
            //print player total
            System.out.println("Current Score: " + table.getPlayerTable()[i].getTotalScore());
            System.out.println();
        }
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