package com.jonas.dicegame;

/**
 * <font color = #d77048>
 * <i>The `Setup` class handles the initial configuration of a dice game.
 * It collects and validates the number of rounds, players, and dice
 * for the game, ensuring they meet the specified constraints.</i>
 */
public class Setup {

    InputProcessing sc = new InputProcessing();

    private int rounds;
    private int numPlayers;
    private int numDice;

    /**
     * <font color = #d77048>
     *     <i>Constructs object with fundamental game setup</i>
     */
    public Setup(){

        setNumPlayers();
        setNumOfDice();
        setRounds();
        System.out.println();
    }

    /**
     * <font color = #d77048>
     *     <i>Get number of rounds</i>
     * @return number of rounds
     */
    public int getRounds() {
        return rounds;
    }

    /**
     * <font color = #d77048>
     *      <i>Set number of rounds</i>
     */
    public void setRounds() {
        int minRounds = 1;
        int maxRounds = 20;
        do {
            System.out.print("Number of rounds: ");
            this.rounds = sc.tryNextInt();

            if (rounds < minRounds) {
                System.out.println("You at least gotta try!");
            }
            if (rounds > maxRounds) {
                System.out.println("Trying to fry the cpu?!..");
            }

        } while (rounds < minRounds || rounds > maxRounds);

    }

    /**
     * <font color = #d77048>
     *     <i>Get number of players</i>
     * @return Number of players.
     */
    public int getNumPlayers() {
        return numPlayers;
    }

    /**
     * <font color = #d77048>
     *     <i>Set number of players.</i>
     */
    private void setNumPlayers() {

        int minPlayers = 2;
        int maxPlayers = 20;
        do {
            System.out.print("Number of players: ");
            this.numPlayers = sc.tryNextInt();

            if (numPlayers < minPlayers) {
                System.out.println("It takes two, at least..");
            }
            if (numPlayers > maxPlayers) {
                System.out.println("Not enough chairs..");
            }

        } while (numPlayers < minPlayers || numPlayers > maxPlayers);

    }

    /**
     * <font color = #d77048>
     *     <i>Get number of dice</i>
     * @return Number of dice.
     */
    public int getNumDice() {
        return numDice;
    }

    /**
     * <font color = #d77048>
     *     <i>Set number of dice</i>
     */
    private void setNumOfDice() {

        int minDice = 1;
        int maxDice = 20;
        do {
            System.out.print("Number of dice: ");
            this.numDice = sc.tryNextInt();

            if (numDice < minDice) {
                System.out.println("Gonna play with air?..");
            }
            if (numDice > maxDice) {
                System.out.println("Dude.. really?..");
            }

        } while (numDice < minDice || numDice > maxDice);
    }
}
