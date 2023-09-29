package com.jonas.dicegame;

/**
 * //Todo - define the player class
 */
public class Player {
    UserInput sc = new UserInput();

    private int pNum;
    private String name;
    private int totalScore;

    /**
     * @return the players number
     */
    public int getPlayerNum() {
        return pNum;
    }
    /**
     * Set value to player number
     * @param playerNum player number
     */
    public void setPlayerNum(int playerNum) {
        this.pNum = playerNum;
    }
    /**
     * @return player name
     */
    public String getName() {
        return name;
    }
    /**
     * Set player name
     */
    public void setName() {
        System.out.print("Player " + this.getPlayerNum() + " Enter you name: ");
        this.name = sc.userInput.nextLine();
    }
    /**
     * @return Players total score
     */
    public int getTotalScore() {
        return totalScore;
    }
    /**
     * Adds score from player round to players total score
     * @param scoreToAdd the score to be added
     */
    public void addTotalScore(int scoreToAdd){
        this.totalScore += scoreToAdd;
    }
}
