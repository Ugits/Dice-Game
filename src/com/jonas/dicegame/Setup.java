/**
 * Game set up
 * The class purpose is to set the foundation for the game.
 */
package com.jonas.dicegame;

public class Setup {
    UserInput sc = new UserInput();
    int minNumOfPlayers = 2;
    int maxNumOfPlayers = 20;
    int numOfPlayers;
    int numOfDice;

    /**
     * Declares number of dice and players.
     */
    public Setup() {
        //Todo call from userInput / make method


        setNumOfPlayers();

        System.out.print("Number of dice: ");
        setNumOfDice(sc.tryNextInt());

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
    public void setNumOfDice(int numOfDice) {

        this.numOfDice = numOfDice;
    }
}
