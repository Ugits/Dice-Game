package com.jonas.dicegame;

import java.util.Arrays;
import java.util.Comparator;

public class Table {

    Player[] players;


    public Table(int numOfPlayers){

        this.players = new Player[numOfPlayers];
        for (int i = 0; i < numOfPlayers; i++) {
            this.players[i] = new Player();
            this.players[i].setPlayerNum(i+1);
            this.players[i].setName();
        }
        System.out.println();
    }

    public void sortScoreDescending(){
        //sorts the original array - implement in Table class
        Arrays.sort(this.players, Comparator.comparingInt(Player::getTotalScore).reversed());
        System.out.println("[DEBUG] Score Descending  [DEBUG]");
    }

    public void displayPlayerTable(){
        for (int i = 0; i < this.players.length; i++) {
            Player player = this.players[i];
            System.out.println("Player: " + player.getPlayerNum());
            System.out.println("Name: " + player.getName());
            System.out.println("Score: " + player.getTotalScore());
            System.out.println();
        }
    }

    public Player[] getPlayerTable() {
        return players;
    }



    public void setPlayerTable(Player[] playerTable) {
        this.players = playerTable;
    }
}
