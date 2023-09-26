/**
 * Game set up
 * The class purpose is to set the foundation for the game.
 */
package com.jonas.dicegame;

public class Setup {

    UserInput sc = new UserInput();
    int rounds = 3;
    int minRounds = 1;
    int maxRounds = 20;
    int numPlayers;
    int minPlayers = 2;
    int maxPlayers = 20;
    int numDice;
    int minDice = 1;
    int maxDice = 20;
    /**
     * Declares number of dice and players.
     */
    public Setup(){
        setNumOfPlayers();
        setNumOfDice();
        //TODO
        // - how many rounds?
        System.out.println();
    }

    public int getRounds() {
        return rounds;
    }

    /**
     * @return Number of players.
     */
    public int getNumPlayers() {
        return numPlayers;
    }

    /**
     * @return Number of dice.
     */
    public int getNumDice() {
        return numDice;
    }

    /**
     * Set number of players.
     *
     * @param numOfPlayers
     */
    public void setNumOfPlayers() {

        do {
            System.out.print("Number of players: ");
            this.numPlayers = sc.tryNextInt();

            //Todo method validNumOfPlayers()
            if (numPlayers < minPlayers) {
                System.out.println("It takes two, at least..");
            }
            if (numPlayers > maxPlayers) {
                System.out.println("Not enough chairs..");
            }

        } while (numPlayers < minPlayers || numPlayers > maxPlayers);

    }

    /**
     * Set number of dice
     *
     * @param numOfDice
     */
    public void setNumOfDice() {

        do {
            System.out.print("Number of dice: ");
            this.numDice = sc.tryNextInt();

            //Todo method validNumOfDice()
            if (numDice < minDice) {
                System.out.println("Gonna play with air?..");
            }
            if (numDice > maxDice) {
                System.out.println("Dude.. really?..");
            }

        } while (numDice < minDice || numDice > maxDice);
    }
}
