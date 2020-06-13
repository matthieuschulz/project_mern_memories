//Q1.1 Write a program that inputs a sequence of Strings
// until the word stop is entered.
// Hint: You compare strings using compareTo, as outlined in the preceding notes.

import java.sql.SQLOutput;
import java.util.ArrayList;


public class Q1 {

    private void inputStringsUntilStopisTyped() {
        Input input = new Input();
        String in;

        do {

            System.out.println("Input a Sequence of Strings: ");
            in = input.nextLine();
            System.out.println("You typed: " + in);
        } while(in.compareTo("Stop")!=0);

    }

    public static void main(String[] args)
    {
        Q1 Q1 = new Q1();
        Q1.inputStringsUntilStopisTyped();
    }

}


