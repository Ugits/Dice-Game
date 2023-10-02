package com.jonas.dicegame;

/**
 * <font color = #d77048>
 * <i>### Define class</i>
 */
public class Player {

    InputProcessing sc = new InputProcessing();

    private int playerNum;
    private String name;
    private int totalScore;

    /**
     * <font color = #d77048>
     *     <i>Get the players assigned number</i>
     * @return the players number
     */
    public int getPlayerNum() {
        return playerNum;
    }

    /**
     * <font color = #d77048>
     * <i>Set value to player number</i>
     * @param playerNum player number
     */
    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    /**
     * <font color = #d77048>
     *     <i>Get the players name</i>
     * @return player name
     */
    public String getName() {
        return name;
    }

    /**
     * <font color = #d77048>
     *     <i>Set players name</i>
     */
    public void setName() {
        System.out.print("Player " + this.getPlayerNum() + " Enter you name: ");
        this.name = sc.nextAlphabeticalLine();
    }

    /**
     * <font color = #d77048>
     *     <i>Get player total score</i>
     * @return Players total score
     */
    public int getTotalScore() {
        return totalScore;
    }

    /**
     * <font color = #d77048>
     *     <i>Adds score from player round to players total score</i>
     * @param scoreToAdd the score to be added
     */
    public void addTotalScore(int scoreToAdd){
        this.totalScore += scoreToAdd;
    }
}
