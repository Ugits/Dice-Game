package com.jonas.dicegame;

public class Game {


    public Game(){
        //Wrap in do while
        // here goes game mechanics

            // Instantiate the custom build scanner
            UserInput sc = new UserInput();

            // Set num of players and dice
            Setup setup = new Setup();

            // Creates an array of players
            Table table = new Table(setup.numOfPlayers);

            // Assign score for compare
            table.playerTable[1].setScore(5);

            // Sort by score, descending,  and Print table
            table.sortScoreDescending();
            table.displayPlayerTable();

    }
}
