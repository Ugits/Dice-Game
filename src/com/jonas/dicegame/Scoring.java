package com.jonas.dicegame;

public class Scoring {

    Player[] table;
    Player[] gold;
    Player[] silver;
    Player[] bronze;

    int goldScore = 0, silverScore = 0, bronzeScore = 0;

    public Scoring(int numOfPlayers, Player[] table){

        this.gold = new Player[numOfPlayers];
        this.silver = new Player[numOfPlayers];
        this.bronze = new Player[numOfPlayers];
        this.table = table;
    }

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

    public void announceWinners(){
        System.out.println("On third place.. with " + this.bronzeScore + " points!");

        for (int i = 0; i < bronze.length; i++) {
            if (bronze[i] != null) System.out.print(" [-" + bronze[i].getName() + "-] ");
        }
        System.out.println();

        System.out.println("And for the silver with " + silverScore + " points!");
        for (int i = 0; i < silver.length; i++) {

            if (silver[i] != null) System.out.print(" [-" + silver[i].getName() + "-] ");
        }
        System.out.println();

        System.out.println("And in the top, carrying the Gold..");
        for (int i = 0; i < gold.length; i++) {

            if (gold[i] != null) System.out.print(" [-" + gold[i].getName() + "-] ");
        }
        System.out.println("With " + goldScore + " points!!");
    }

}
