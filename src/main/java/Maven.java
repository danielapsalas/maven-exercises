import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Maven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asks the user for input and outputs the user input
        System.out.println("Enter something: ");
        String userInput = input.nextLine();
        System.out.println("\nYou entered: " + userInput);

        //checks if its a number
        boolean numOrNot = StringUtils.isNumeric(userInput);
        String answerToNum = numOrNot ? "is a number" : "is not a number";
        System.out.print("\n" + userInput + " " + answerToNum + "\n");

        //flipped case
        System.out.println("\nFlipped Case: " + StringUtils.swapCase(userInput));

        //reversed
        System.out.println("\nReversed: " + StringUtils.reverse(userInput));

    }
}
