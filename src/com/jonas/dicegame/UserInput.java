package com.jonas.dicegame;
import java.util.Scanner;
/*TODO Look up structure for custom made scanner class*/
public class UserInput {

    Scanner userInput;

    /**
     * Constructs object with custom-made scanner
     */
    public UserInput(){
        setUserInput(new Scanner(System.in));
    }

    /**
     * Validates that user input is of type int
     * @return An int from user
     */
    public int tryNextInt(){
        while (!userInput.hasNextInt()){
            System.out.println("That's not a number");
            userInput.next();
        }
        return userInput.nextInt();
    }

    public Scanner getUserInput() {
        return userInput;
    }

    /**
     * Instantiates the UserInput
     * @param userInput Scanner(System.in)
     */
    public void setUserInput(Scanner userInput) {
        this.userInput = userInput;
    }
}

