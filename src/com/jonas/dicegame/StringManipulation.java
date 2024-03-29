package com.jonas.dicegame;

/**
 * <font color = #d77048>
 * <i>The `StringManipulation` class provides methods for displaying strings
 * with specific formatting and color effects. It allows for printing strings
 * character by character with delays, adding random pastel colors to characters,
 * and generating ANSI escape codes for colorful output.</i>
 */
public class StringManipulation {

    /**
     * <font color = #d77048>
     * <i>Prints char by char of string output with delay, and adds boldness</i>
     *
     * @param string String to process
     * @throws InterruptedException Thrown if interrupted while sleeping.
     */
    public void delayOutputNonColor(String string) throws InterruptedException {

        for (char c : string.toCharArray()) {

            System.out.print("\u001B[97m" + "\u001B[1m" + c + "\u001B[0m");
            Thread.sleep(70);
        }
    }

    /**
     * <font color = #d77048>
     * <i>Prints char by char of string output with delay, and adds color and boldness</i>
     * @param string The string, to manipulate
     * @throws InterruptedException Thrown if interrupted while sleeping.
     */
    public void delayOutputColor(String string) throws InterruptedException {
        for (char c : string.toCharArray()) {

            System.out.print(randomPastel() + "\u001B[1m" + c + "\u001B[0m");
            Thread.sleep(70);
        }
    }

    /**
     * <font color = #d77048>
     *     <i>Generates a random color</i>
     * @return ANSI escape code
     */
    public String randomPastel() {
        Game game = new Game();
        int randomNum = game.genNum(7);
        return colorSwitch(randomNum);

    }

    /**
     * <font color = #d77048>
     *     <i>A switch that holds Ansi colors</i>
     * @param randomNum import random int
     * @return ANSI escape code
     */
    public String colorSwitch(int randomNum){
        String escapeCode;
        switch (randomNum) {
            case 1:
                escapeCode = "\u001B[31m"; // Red
                break;
            case 2:
                escapeCode = "\u001B[38;5;208m"; // Orange
                break;
            case 3:
                escapeCode = "\u001B[33m"; // Yellow
                break;
            case 4:
                escapeCode = "\u001B[32m"; // Green
                break;
            case 5:
                escapeCode = "\u001B[34m"; // Blue
                break;
            case 6:
                escapeCode = "\u001B[35m"; // Indigo
                break;
            case 7:
                escapeCode = "\u001B[36m"; // Violet
                break;
            default:
                escapeCode = "\u001B[0m"; // Invalid Color (Black)
                break;
        }
        return escapeCode;
    }

    /**
     * <font color = #d77048>
     *     <i>Creates a line break</i>
     */
    public void br(){
        System.out.println();
    }

}
