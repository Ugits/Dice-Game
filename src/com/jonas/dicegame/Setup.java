/**
 * Game set up
 * The class purpose is to set the foundation for the game.
 */
package com.jonas.dicegame;

public class Setup {

    UserInput sc = new UserInput();

    int numOfPlayers;
    int minNumOfPlayers = 2;
    int maxNumOfPlayers = 20;
    int numOfDice;
    int minNumOfDice = 1;
    int maxNumOfDice = 20;
    /**
     * Declares number of dice and players.
     */
    public Setup() {

        setNumOfPlayers();
        setNumOfDice();

        System.out.println();
    }

    /**
     * @return Number of players.
     */
    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    /**
     * @return Number of dice.
     */
    public int getNumOfDice() {
        return numOfDice;
    }

    /**
     * Set number of players.
     *
     * @param numOfPlayers
     */
    public void setNumOfPlayers() {

        do {
            System.out.print("Number of players: ");
            this.numOfPlayers = sc.tryNextInt();

            //Todo method validNumOfPlayers()
            if (numOfPlayers < minNumOfPlayers) {
                System.out.println("It takes two, at least..");
            }
            if (numOfPlayers > maxNumOfPlayers) {
                System.out.println("Not enough chairs..");
            }

        } while (numOfPlayers < minNumOfPlayers || numOfPlayers > maxNumOfPlayers);

    }

    /**
     * Set number of dice
     *
     * @param numOfDice
     */
    public void setNumOfDice() {

        do {
            System.out.print("Number of dice: ");
            this.numOfDice = sc.tryNextInt();

            //Todo method validNumOfDice()
            if (numOfDice < minNumOfDice) {
                System.out.println("Gonna play with air?..");
            }
            if (numOfDice > maxNumOfDice) {
                System.out.println("Dude.. really?..");
            }

        } while (numOfDice < minNumOfDice || numOfDice > maxNumOfDice);
    }
}
