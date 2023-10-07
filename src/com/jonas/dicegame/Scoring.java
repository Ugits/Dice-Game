package com.jonas.dicegame;

/**
 * <font color = #d77048>
 * <i>The `Scoring` class manages the scoring and ranking of players in the dice game.
 * It sorts players into gold, silver, and bronze categories based on their scores and
 * announces the top three players.</i>
 */
public class Scoring {

    private final Player[] table;
    private final Player[] gold;
    private final Player[] silver;
    private final Player[] bronze;
    private int goldScore = 0;
    private int silverScore = 0;
    private int bronzeScore = 0;

    /**
     * <font color = #d77048>
     *     <i>Construct object that stores player table for tracking player scores.
     * And instantiates additional arrays for sorting final scores.</i>
     * @param numOfPlayers import number of players
     * @param table import player table
     */
    public Scoring(int numOfPlayers, Player[] table){

        this.gold = new Player[numOfPlayers];
        this.silver = new Player[numOfPlayers];
        this.bronze = new Player[numOfPlayers];
        this.table = table;
    }

    /**
     * <font color = #d77048>
     *     <i>Sorts players into arrays corresponding to their placings</i>
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
     * <font color = #d77048>
     *     <i>Prints the players with the top 3 scores</i>
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
