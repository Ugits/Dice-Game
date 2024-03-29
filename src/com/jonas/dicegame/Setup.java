package com.jonas.dicegame;

/**
 * <font color = #d77048>
 * <i>The `Setup` class handles the initial configuration of a dice game.
 * It collects and validates the number of rounds, players, and dice
 * for the game, ensuring they meet the specified constraints.</i>
 */
public class Setup {
    StringManipulation output = new StringManipulation();
    InputProcessing sc = new InputProcessing();

    private int rounds;
    private int numPlayers;
    private int numDice;

    /**
     * <font color = #d77048>
     *     <i>Constructs object with fundamental game setup</i>
     */
    public Setup() throws InterruptedException {

        setNumPlayers();
        setNumOfDice();
        setRounds();
        output.br();
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
    public void setRounds() throws InterruptedException {
        int minRounds = 1;
        int maxRounds = 20;
        do {
            output.delayOutputNonColor("Number of rounds: ");
            this.rounds = sc.tryNextInt();
            output.br();

            if (rounds < minRounds) {
                output.delayOutputNonColor("You at least gotta try!");
                output.br();
            }
            if (rounds > maxRounds) {
                output.delayOutputNonColor("Trying to fry the cpu?!..");
                output.br();
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
    private void setNumPlayers() throws InterruptedException {

        int minPlayers = 2;
        int maxPlayers = 20;
        do {

            output.delayOutputNonColor("Number of players: ");
            this.numPlayers = sc.tryNextInt();
            output.br();

            if (numPlayers < minPlayers) {
                output.delayOutputNonColor("It takes two, at least..");
                output.br();
            }
            if (numPlayers > maxPlayers) {
                output.delayOutputNonColor("Not enough chairs..");
                output.br();
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
    private void setNumOfDice() throws InterruptedException {

        int minDice = 1;
        int maxDice = 20;
        do {
            output.delayOutputNonColor("Number of dice: ");
            this.numDice = sc.tryNextInt();
            output.br();

            if (numDice < minDice) {
                output.delayOutputNonColor("Gonna play with air?..");
                output.br();
            }
            if (numDice > maxDice) {
                output.delayOutputNonColor("Dude.. really?..");
                output.br();
            }

        } while (numDice < minDice || numDice > maxDice);
    }
}
