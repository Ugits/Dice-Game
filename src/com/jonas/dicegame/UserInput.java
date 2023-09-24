package com.jonas.dicegame;
import java.util.Scanner;

public class UserInput {

    Scanner userInput;

    public UserInput(){
        setUserInput(new Scanner(System.in));
    }

    /**
     * Validates that user input is of type int
     * @return An int from user
     */
    public int tryNextInt(){
        // iterates until input is of type int
        while (!userInput.hasNextInt()){
            System.out.println("That's not a number");
            userInput.next();
        }
        return userInput.nextInt();
    }

    public Scanner getUserInput() {
        return userInput;
    }

    public void setUserInput(Scanner userInput) {
        this.userInput = userInput;
    }
}

