package com.jonas.dicegame;

import java.util.Arrays;

public class Game {
    int setupRounds = 5;
    int currentRound = 0;
    public Game() {
        gameLogic();

    }

    public void gameLogic(){
        //Wrap in do while
        // here goes game mechanics

        // Instantiate the custom build scanner
        UserInput sc = new UserInput();
        // Set num of players and dice
        Setup setup = new Setup();
        setup.setUpGame();
        // Instantiate the Player class
        //Player player = new Player();
        // Creates an array of players
        Table table = new Table(setup.numOfPlayers);
        Scoring finalScore = new Scoring(setup.numOfPlayers, table.getPlayerTable());

        Dice d6 = new Dice();

        /** //GameLoop

         do {
         currentRound++;
         System.out.println("Round " + currentRound + "!");
         }while (currentRound <= setupRounds);
         */

        // runda där alla kastar
        for (int i = 0; i < table.getPlayerTable().length; i++) {
            //roll
            d6.roll(setup.getNumOfDice());
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

        // Sort by score, descending,  and Print table
        table.sortScoreDescending();
        //assign medals
        finalScore.assignMedals();
        //announce the winners
        finalScore.announceWinners();
    }




    //todo Turn
    //  * roll dice
    //  * sum score
    //  * add score
    //TODO score
    //  * compare score
    //  * sort into gold, silver and bronze
    //  declare winner
    //  declare more than 1 winner // compare winner to next in table
    //  1,2,3 place?
    //  for loop --> round
    //  ending options
    //  play again?
    //  play another game

    // Assign score for compare
    // table.players[1].setTotalScore(5);

}



//