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
        Player[] gold = new Player[setup.numOfPlayers];
        Player[] silver = new Player[setup.numOfPlayers];
        Player[] bronze = new Player[setup.numOfPlayers];

        int playerCount = 0;
        int goldCount = 0, silverCount = 0, bronzeCount = 0;
        int goldThreshold = 0, silverThreshold = 0, bronzeThreshold = 0;
        for (Player player : table.getPlayerTable()) {
            if (player == null) {
                continue;
            }
            table.displayPlayerTable();
            int playerScore = table.getPlayerTable()[playerCount].getTotalScore();


            if (playerScore >= goldThreshold) {
                gold[goldCount] = player;
                goldCount++;
                playerCount++;
                goldThreshold = playerScore;
                System.out.println("Gold [DEBUG]");
            } else if (playerScore >= silverThreshold) {
                silver[silverCount] = player;
                silverCount++;
                playerCount++;
                silverThreshold = playerScore;
                System.out.println("Silver [DEBUG]");
            } else if (playerScore >= bronzeThreshold) {
                bronze[bronzeCount] = player;
                bronzeCount++;
                playerCount++;
                silverThreshold = playerScore;
                System.out.println("Bronze [DEBUG]");
            }
        }

        //announce the winners
        System.out.println("On third place.. with " + bronzeThreshold + " points!");

        for (int i = 0; i < bronzeCount; i++) {
            System.out.print(" [-" + bronze[i].getName() + "-] ");
        }
        System.out.println();

        System.out.println("And for the silver with " + silverThreshold + " points!");
        for (int i = 0; i < silverCount; i++) {
            System.out.print(" [-" + silver[i].getName() + "-] ");
        }
        System.out.println(" ");

        System.out.println("And in the top, carrying the Gold..");
        for (int i = 0; i < goldCount; i++) {
            System.out.print(" [-" + gold[i].getName() + "-] ");
        }
        System.out.println("With " + goldThreshold + " points!!");



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