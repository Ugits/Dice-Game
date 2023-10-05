package com.jonas.dicegame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * <font color = #d77048>
 * <i>### Define Class</i>
 */
public class Table {

    private final Player[] table;
    /**
     * <font color = #d77048>
     *     <i>Constructs object that holds an array with all players</i>
     * @param numOfPlayers number of players
     */
    public Table(int numOfPlayers){
        this.table = new Player[numOfPlayers];
        for (int i = 0; i < numOfPlayers; i++) {
            this.table[i] = new Player();
            this.table[i].setNum(i+1);
            this.table[i].setName();
            this.table[i].setColor(playerColor(i));
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

    public String playerColor(int index){
        ArrayList<String> colors = new ArrayList<>();
            colors.add("\u001B[33m");       // Gold
            colors.add("\u001B[37m");       // Silver
            colors.add("\u001B[38;5;206m"); // Pink
            colors.add("\u001B[38;5;30m");  // Teal
            colors.add("\u001B[38;5;183m"); // Lavender
            colors.add("\u001B[38;5;203m"); // Coral
            colors.add("\u001B[38;5;80m");  // Turquoise
            colors.add("\u001B[38;5;84m");  // Mint Green
            colors.add("\u001B[38;5;177m"); // Lilac
            colors.add("\u001B[38;5;208m"); // Peach
            colors.add("\u001B[38;5;63m");  // Royal Blue
            colors.add("\u001B[38;5;34m");  // Emerald Green
            colors.add("\u001B[38;5;214m"); // Tangerine
            colors.add("\u001B[38;5;117m"); // Sky Blue
            colors.add("\u001B[38;5;93m");  // Plum
            colors.add("\u001B[38;5;226m"); // Canary Yellow
            colors.add("\u001B[38;5;201m"); // Fuchsia
            colors.add("\u001B[38;5;51m");  // Aqua
            colors.add("\u001B[38;5;88m");  // Maroon
            colors.add("\u001B[38;5;230m");  // Beige

        //System.out.println(colors.get(0) + "random" + "\u001B[0m");
        return colors.get(index);
    }





   /*
    *  // TA BORT???


     public void setTable(Player[] table) {
         this.table = table;
     }


     public void displayPlayerTable(){
         for (int i = 0; i < this.table.length; i++) {
             Player player = this.table[i];
             System.out.println("Player: " + player.getNum());
             System.out.println("Name: " + player.getName());
             System.out.println("Score: " + player.getTotalScore());
             System.out.println();
         }
     }
    */
}
