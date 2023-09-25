package com.jonas.dicegame;

import java.util.Arrays;

public class Game {


    public Game() {
        //Wrap in do while
        // here goes game mechanics

        // Instantiate the custom build scanner
        UserInput sc = new UserInput();
        // Set num of players and dice
        Setup setup = new Setup();
        // Instantiate the Player class
        //Player player = new Player();
        // Creates an array of players
        Table table = new Table(setup.numOfPlayers);

        Dice d6 = new Dice();

        //flera rundor
        //roll
        d6.roll(setup.getNumOfDice());
        //sum roll
        int sum = d6.sumUpRoll();
        // add score
        table.getPlayerTable()[0].setTotalScore(sum);
        //print roll + roll total
        System.out.println(d6.printRoll() + " = " + d6.sumUpRoll());
        //print player total
        System.out.println("Total Score: " + table.getPlayerTable()[0].getTotalScore());

        //next player

        //roll
        d6.roll(setup.getNumOfDice());
        //sum roll
        sum = d6.sumUpRoll();
        // add score
        table.getPlayerTable()[1].setTotalScore(sum);
        //print roll + roll total
        System.out.println(d6.printRoll() + " = " + d6.sumUpRoll());
        //print player total
        System.out.println("Total score: " + table.getPlayerTable()[1].getTotalScore());


        // Sort by score, descending,  and Print table
        table.sortScoreDescending();
        table.displayPlayerTable();

        //compare score

        //todo printa alla som delar på högsta påäng

        //todo printa alla som delar på näst högsta påäng

        //todo print alla som delar på tredje högsta poäng

        Player[] gold = new Player[setup.numOfPlayers];
        Player[] silver = new Player[setup.numOfPlayers];
        Player[] bronze = new Player[setup.numOfPlayers];



        table.displayPlayerTable();

        int playerCount = 0;
        int goldCount = 0, silverCount = 0, bronzeCount = 0;
        int goldThreshold = 0, silverThreshold = 0, bronzeThreshold = 0;
        for (Player player : table.getPlayerTable()) {
            if (player == null) {
                continue;
            }

            int playerScore = table.getPlayerTable()[playerCount].getTotalScore();
            playerCount++;

            if (playerScore >= goldThreshold) {
                gold[goldCount] = player;
                goldCount++;
                goldThreshold = table.getPlayerTable()[playerCount].getTotalScore();
                System.out.println("Gold");
            } else if (playerScore >= silverThreshold) {
                silver[silverCount] = player;
                silverCount++;
                silverThreshold = table.getPlayerTable()[playerCount].getTotalScore();
                System.out.println("Silver");
            } else if (playerScore >= bronzeThreshold) {
                bronze[bronzeCount] = player;
                bronzeCount++;
                silverThreshold = table.getPlayerTable()[playerCount].getTotalScore();
                System.out.println("Bronze");
            }
        }

    }


    //todo Turn
    //  * roll dice
    //  * sum score
    //  * add score
    //TODO score
    //  compare score
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