package com.jonas.dicegame;

import java.util.Arrays;
import java.util.Comparator;

public class Table {

    private Player[] table;

    /**
     * Constructs object that holds an array with all players
     * @param numOfPlayers number of players
     */
    public Table(int numOfPlayers){
        this.table = new Player[numOfPlayers];
        for (int i = 0; i < numOfPlayers; i++) {
            this.table[i] = new Player();
            this.table[i].setPlayerNum(i+1);
            this.table[i].setName();
        }
        System.out.println();
    }

    /**
     * Sorts the player table in descending order
     */
    public void sortScoreDescending(){
        Arrays.sort(this.table, Comparator.comparingInt(Player::getTotalScore).reversed());
    }

    /**
     *
     * @return Player[ ] playerTable
     */
    public Player[] getTable() {
        return table;
    }


    public void setTable(Player[] table) {
        this.table = table;
    }

    public void displayPlayerTable(){
        for (int i = 0; i < this.table.length; i++) {
            Player player = this.table[i];
            System.out.println("Player: " + player.getPlayerNum());
            System.out.println("Name: " + player.getName());
            System.out.println("Score: " + player.getTotalScore());
            System.out.println();
        }
    }
}
