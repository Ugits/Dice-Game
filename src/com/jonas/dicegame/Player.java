package com.jonas.dicegame;

public class Player {

    int pNum;
    String name;
    int score;
    boolean winner;

    /**
     * Declares player name och initialize score.
     */
    public Player (){
        UserInput sc = new UserInput();

        System.out.print("Enter you name: ");
        setPlayerName(sc.userInput.nextLine());
        setScore(0);
    }

    // getter-setter
    public int getPlayerNum() {
        return pNum;
    }

    public void setPlayerNum(int playerNum) {
        this.pNum = playerNum;
    }

    public String getName() {
        return name;
    }

    public void setPlayerName(String playerName) {
        this.name = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}
