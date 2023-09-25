package com.jonas.dicegame;

public class Game {


    public Game(){
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
}

//