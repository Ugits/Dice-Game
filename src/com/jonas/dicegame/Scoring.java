package com.jonas.dicegame;

public class Scoring {

    Player[] table;
    Player[] gold;
    Player[] silver;
    Player[] bronze;

    int goldScore = 0, silverScore = 0, bronzeScore = 0;

    /**
     * Constructs object that imports player array.
     * And instantiates additional arrays for sorting final scores.
     * @param numOfPlayers number of players
     * @param table Player[ ] table
     */
    public Scoring(int numOfPlayers, Player[] table){

        this.gold = new Player[numOfPlayers];
        this.silver = new Player[numOfPlayers];
        this.bronze = new Player[numOfPlayers];
        this.table = table;
    }
    /**
     * Sorts players into arrays corresponding to their placings
     */
    public void assignMedals(){

        int playerCount = 0;
        int goldCount = 0, silverCount = 0, bronzeCount = 0;
        for (Player player : table) {
            if (player == null) {
                continue;
            }

            int playerScore = table[playerCount].getTotalScore();

            if (playerScore >= goldScore) {
                gold[goldCount] = player;
                goldCount++;
                playerCount++;
                goldScore = playerScore;
                System.out.println("Gold [DEBUG]");

            } else if (playerScore >= silverScore) {
                silver[silverCount] = player;
                silverCount++;
                playerCount++;
                silverScore = playerScore;
                System.out.println("Silver [DEBUG]");

            } else if (playerScore >= bronzeScore) {
                bronze[bronzeCount] = player;
                bronzeCount++;
                playerCount++;
                bronzeScore = playerScore;
                System.out.println("Bronze [DEBUG]");

            }
        }
    }

    /**
     * Prints the players with the top 3 scores
     */
    public void announceWinners(){

        System.out.println("On third place.. with " + this.bronzeScore + " points!");
        for (Player item : this.bronze) if (item != null) System.out.print(" [-" + item.getName() + "-] ");
        System.out.println();

        System.out.println("And for the silver with " + this.silverScore + " points!");
        for (Player value : this.silver) if (value != null) System.out.print(" [-" + value.getName() + "-] ");
        System.out.println();

        System.out.println("And in the top, carrying the Gold..");
        for (Player player : this.gold) if (player != null) System.out.print(" [-" + player.getName() + "-] ");
        System.out.println("With " + this.goldScore + " points!!");
    }


}
