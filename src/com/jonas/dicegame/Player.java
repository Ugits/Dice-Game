package com.jonas.dicegame;

/**
 * <font color = #d77048>
 * <i>### Define class</i>
 */
public class Player {



    private int num;
    private String name;
    private String color;  // TODO: 2023-10-02  Make color array.. (added on in this script)
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

    public void playerColors(){
        String[] colors = {
                "\u001B[33m",     // Gold
                "\u001B[37m",     // Silver
                "\u001B[38;5;206m", // Pink
                "\u001B[38;5;30m",  // Teal
                "\u001B[38;5;183m", // Lavender
                "\u001B[38;5;203m", // Coral
                "\u001B[38;5;80m",  // Turquoise
                "\u001B[38;5;84m",  // Mint Green
                "\u001B[38;5;177m", // Lilac
                "\u001B[38;5;208m", // Peach
                "\u001B[38;5;63m",  // Royal Blue
                "\u001B[38;5;34m",  // Emerald Green
                "\u001B[38;5;214m", // Tangerine
                "\u001B[38;5;117m", // Sky Blue
                "\u001B[38;5;93m",  // Plum
                "\u001B[38;5;226m", // Canary Yellow
                "\u001B[38;5;201m", // Fuchsia
                "\u001B[38;5;51m",  // Aqua
                "\u001B[38;5;88m",  // Maroon
                "\u001B[38;5;230m"  // Beige
        };

        for (int i = 0; i < colors.length; i++) {
            System.out.println("Color " + i + ": " + colors[i] + "This is colored text." + "\u001B[0m");
        }
    }
}
