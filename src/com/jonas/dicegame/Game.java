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
        Player player = new Player();
        // Creates an array of players
        Table table = new Table(setup.numOfPlayers);


        Dice d6 = new Dice();
        //roll
        d6.roll(setup.getNumOfDice());
        //sum roll
        int sum = d6.sumUpRoll();
        // add score
        table.getPlayerTable()[0].setTotalScore(sum);
        //next player

        //todo Turn
        //  * roll dice
        //  * sum score
        //  * add score
        //

        // Assign score for compare
        table.players[1].setTotalScore(5);

        // Sort by score, descending,  and Print table
        table.sortScoreDescending();
        table.displayPlayerTable();


    }
}

