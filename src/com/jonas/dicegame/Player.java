package com.jonas.dicegame;

/**
 * <font color = #d77048>
 * <i>### Define class</i>
 */
public class Player {



    private int num;
    private String name;
    private String color;
    private int totalScore;

    /**
     * <font color = #d77048>
     *     <i>Get the players assigned number</i>
     * @return the players number
     */
    public int getNum() {
        return num;
    }

    /**
     * <font color = #d77048>
     * <i>Set value to player number</i>
     * @param num player number
     */
    public void setNum(int num) {
        this.num = num;
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
        InputProcessing sc = new InputProcessing();
        System.out.print("Player " + this.getNum() + " Enter you name: ");
        this.name = sc.nextAlphabeticalLine();

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
