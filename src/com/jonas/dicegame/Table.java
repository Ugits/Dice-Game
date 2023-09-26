package com.jonas.dicegame;

import java.util.Arrays;
import java.util.Comparator;

public class Table {

    Player[] playerTable;  //TODO - as ArrayList<Player>? (se kristoffer (video 26 sep 2:50))



    public Table(){

    }
    public Table(int numOfPlayers){

        this.playerTable = new Player[numOfPlayers];
        for (int i = 0; i < numOfPlayers; i++) {
            this.playerTable[i] = new Player();
            this.playerTable[i].setPlayerNum(i+1);
            this.playerTable[i].setName();
        }
        System.out.println();
    }

    public void sortScoreDescending(){
        //sorts the original array - implement in Table class
        Arrays.sort(this.playerTable, Comparator.comparingInt(Player::getTotalScore).reversed());
        System.out.println("[DEBUG] Score Descending  [DEBUG]");
    }

    public void displayPlayerTable(){
        for (int i = 0; i < this.playerTable.length; i++) {
            Player player = this.playerTable[i];
            System.out.println("Player: " + player.getPlayerNum());
            System.out.println("Name: " + player.getName());
            System.out.println("Score: " + player.getTotalScore());
            System.out.println();
        }
    }

    public Player[] getPlayerTable() {
        return playerTable;
    }



    public void setPlayerTable(Player[] playerTable) {
        this.playerTable = playerTable;
    }
}
