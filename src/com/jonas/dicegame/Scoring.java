package com.jonas.dicegame;

/**
 * <font color = #d77048>
 * <i>The `Scoring` class manages the scoring and ranking of players in the dice game.
 * It sorts players into gold, silver, and bronze categories based on their scores and
 * announces the top three players.</i>
 */
public class Scoring {

    StringManipulation output = new StringManipulation();

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

            } else if (playerScore >= silverScore) {
                silver[silverCount] = player;
                silverCount++;
                playerCount++;
                silverScore = playerScore;

            } else if (playerScore >= bronzeScore) {
                bronze[bronzeCount] = player;
                bronzeCount++;
                playerCount++;
                bronzeScore = playerScore;
            }
        }
    }

    /**
     * <font color = #d77048>
     *     <i>Prints intro to counting</i>
     * @throws InterruptedException
     */
    private void introAnnounceVisual() throws InterruptedException {
        output.delayOutputColor("Comparing score . . . . ");
        Thread.sleep(2000);
        output.delayOutputColor("Done!!");
        output.br();
        output.br();
    }

    /**
     * <font color = #d77048>
     *     <i>Prints the players with the top 3 scores</i>
     */
    public void announceWinners() throws InterruptedException {

        introAnnounceVisual();

        if (!(bronzeScore == 0)) {

            output.delayOutputNonColor("Qualifying the ");
            System.out.print("\u001B[38;2;139;69;19m" + "\u001B[1m" + "BRONZE" +"\u001B[0m");
            output.delayOutputNonColor(" .. with " + this.bronzeScore + " points!");

            output.br();
            Thread.sleep(500);

            for (Player player : this.bronze) printPlayers(player);

            output.br();
            output.br();
        }

        if (!(silverScore == 0)) {

            output.delayOutputNonColor("For the ");
            System.out.print("\u001B[37m" + "\u001B[1m" + "SILVER" +"\u001B[0m");
            output.delayOutputNonColor(" with " + this.silverScore + " points!");

            output.br();
            Thread.sleep(500);

            for (Player player : this.silver) printPlayers(player);

            output.br();
            output.br();
        }

        if (!(goldScore == 0)) {

            output.delayOutputNonColor("In the top, carrying the ");
            System.out.print("\u001B[38;5;214m" + "\u001B[1m" + "GOLD !" +"\u001B[0m");
            output.delayOutputNonColor(" With " + this.goldScore + " points!");

            output.br();
            Thread.sleep(500);

            for (Player player : this.gold) printPlayers(player);

            output.br();
            output.br();
        }

    }

    /**
     * <font color = #d77048>
     *     <i>Print the player in players color</i>
     * @param player player obj
     */
    private void printPlayers(Player player) throws InterruptedException {
        if (player != null) {
            Thread.sleep(1000);
            System.out.println(player.getColor() + "\u001B[1m" + player.getName() + "\u001B[0m");
            Thread.sleep(1000);
        }
    }

}
