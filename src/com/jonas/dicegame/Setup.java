/**
 * Game set up
 * The class purpose is to set the foundation for the game.
 */
package com.jonas.dicegame;
/**
 * <font color = #d77048>
 * <i>### Define Class</i>
 */
public class Setup {

    InputProcessing sc = new InputProcessing();

    private int rounds;
    private final int minRounds = 1;
    private final int maxRounds = 20;
    private int numPlayers;
    private final int minPlayers = 2;
    private final int maxPlayers = 20;
    private int numDice;
    private final int minDice = 1;
    private final int maxDice = 20;

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
