package com.jonas.dicegame;

public class Main {

    public static void main(String[] args) {

        // Instantiate the custom build scanner
        UserInput sc = new UserInput();

        // Set num of players and dice
        Setup setup = new Setup();

        // Creates an array of players
        Table table = new Table(setup.numOfPlayers);

        // Assign score for compare
        table.playerTable[1].setScore(5);

        // Sort by score, descending,  and Print table
        table.sortScoreDescending();
        table.displayPlayerTable();
    }
}
 /*TODO
            *  Här ska användaren via en Scanner ska kunna välja:
                * ● Antal spelare - VG
                * ● Antal Tärningar
                * ● Spelarens namn
            *  -----------------------------------------------------------------
            *  Regler:
                ● Varje spelare får en/flera tärningar att kasta per tur
                ● Spelaren med högst poäng vinner (åtminstone 2
                spelare ska finnas med)
            *  -----------------------------------------------------------------
            *  Väl Godkänt:
                ● Två vinnare - hantera detta på ett relevant sätt
                * ● Scanner befinner sig inom en egen klass
                * ● Hantera att rätt svar kommer in under inmatning
                    * ○ Namn får bara vara ‘string’
                    * ○ Nummer får bara vara ‘integer’
                ● Tre relevanta enhetstester */
