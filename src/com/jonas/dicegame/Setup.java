/**
 * Game set up
 * The class purpose is to set the foundation for the game.
 */
package com.jonas.dicegame;

public class Setup {
    UserInput sc = new UserInput();

    int numOfPlayers;
    int numOfDice;

    /**
     * Declares number of dice and players.
     */
    public Setup(){
        //Todo call from userInput / make method
        System.out.print("Number of players: ");
        setNumOfPlayers(sc.tryNextInt());

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
     * @param numOfPlayers
     */
    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }
    /**
     * Set number of dice
     * @param numOfDice
     */
    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }
}
