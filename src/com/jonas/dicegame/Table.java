package com.jonas.dicegame;
import java.util.Arrays;
import java.util.Comparator;

/**
 * <font color = #d77048>
 * <i>### Define Class</i>
 */
public class Table {

    private Player[] table;

    /**
     * <font color = #d77048>
     *     <i>Constructs object that holds an array with all players</i>
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
     * <font color = #d77048>
     *     <i>Sorts the player table in descending order</i>
     */
    public void sortScoreDescending(){
        Arrays.sort(this.table, Comparator.comparingInt(Player::getTotalScore).reversed());
    }

    /**
     *<font color = #d77048>
     *     <i>Get the player table</i>
     * @return Player[ ] playerTable
     */
    public Player[] getTable() {
        return table;
    }





    // TA BORT???

    /**
     *
     * @param table
     */
    public void setTable(Player[] table) {
        this.table = table;
    }

    /**
     *
     */
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
