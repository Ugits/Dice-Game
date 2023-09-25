package com.jonas.dicegame;

public class Player {
    UserInput sc = new UserInput();

    int pNum;
    String name;
    int totalScore;
    boolean winner;



    public int getPlayerNum() {
        return pNum;
    }

    public void setPlayerNum(int playerNum) {
        this.pNum = playerNum;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.print("Player " + this.getPlayerNum() + " Enter you name: ");
        this.name = sc.userInput.nextLine();
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

}
