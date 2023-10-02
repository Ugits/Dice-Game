package com.jonas.dicegame;
import java.util.Scanner;
/*TODO Look up structure for custom made scanner class*/

/**
 * <font color = #d77048>
 * <i>### Define Class</i>
 */
public class UserInput {

    Scanner userInput;

    /**
     * <font color = #d77048>
     *     <i>Constructs object with custom-made scanner</i>
     */
    public UserInput(){
        setUserInput(new Scanner(System.in));
    }

    /**
     * <font color = #d77048>
     *     <i>Validates that user input is of type int</i>
     * @return An int from user
     */
    public int tryNextInt(){
        while (!userInput.hasNextInt()){
            System.out.println("That's not a number");
            userInput.next();
        }
        return userInput.nextInt();
    }

    /**
     *
     * @return
     */
    public Scanner getUserInput() {
        return userInput;
    }

    /**
     * <font color = #d77048>
     *     <i>Instantiates the UserInput</i>
     * @param userInput Scanner(System.in)
     */
    public void setUserInput(Scanner userInput) {
        this.userInput = userInput;
    }
}

