package com.jonas.dicegame;
import java.util.Random;
import java.util.Scanner;

/**
 * <font color = #d77048>
 * <i>### Define Class</i>
 */
public class InputProcessing {

    private Scanner scanner;

    /**
     * <font color = #d77048>
     * <i>Constructs object with custom-made scanner</i>
     */
    public InputProcessing() {
        setScanner(new Scanner(System.in));
    }

    /**
     * <font color = #d77048>
     *     <i>Generates a random number.
     *     The values range varies depending on the argument value</i>
     * @param randomRange is the max value of a random number
     * @return  A random number 1 -> randomRange
     */
    public int genNum(int randomRange){
        Random rand = new Random();
        return rand.nextInt(randomRange) + 1;
    }

    /**
     * <font color = #d77048>
     * <i>Validates that user input is of type int</i>
     *
     * @return An int from user
     */
    public int tryNextInt() {
        while (!getScanner().hasNextInt()) {
            System.out.println("That's not a number");
            getScanner().next();
        }
        return getScanner().nextInt();
    }

    /**
     * <font color = #d77048>
     * <i>Get user input. No input is refused. Only alphabetical symbols</i>
     * @return a String value
     */
    public String nextAlphabeticalLine()  {
        String temp;
        do {
            temp = getScanner().nextLine().trim();
            if (temp.isEmpty() || !temp.matches("^[a-öA-Ö ]*$")) {
                System.out.println("Give me some letters...");
            }
        } while (temp.isEmpty() || !temp.matches("^[a-öA-Ö ]*$"));
        return temp;
    }

    /**
     * <font color = #d77048>
     * <i>Dispose object for garbage collecting</i>
     */
    public void close() {
        getScanner().close();
    }

    /**
     * <font color = #d77048>
     * <i>Call Scanner object</i>
     * @return scanner obj
     */
    private Scanner getScanner() {
        return scanner;
    }

    /**
     * <font color = #d77048>
     * <i>Instantiates the Scanner</i>
     *
     * @param scanner Scanner(System.in)
     */
    private void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }


}

