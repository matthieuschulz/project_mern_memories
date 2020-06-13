//Write a class that has methods to input a collection of integers,
// storing them as integer objects in an ArrayList<Integer>,
// to sort the ArrayList<Integer> and to display the sorted contents of the ArrayList<Integer>.
//The ArrayList<Integer> should be stored using an instance variable

//input Integer

import java.util.ArrayList;
import java.util.Collections;

public class Example4 {

    private ArrayList<Integer> numbers = new ArrayList<>();

    private void displayIntegers()
    {
        for (int i : numbers)
        {
            System.out.println(i);
            
        }

    }

    private void inputIntegers()
    {
      Input in = new Input();
      System.out.println("How many integers do you wish to input? ");

      int count = in.nextInt();
        for (int i = 0; i < count; i++) {

            System.out.print("Enter integer (" + i + ") : ");
            int value = in.nextInt();
            numbers.add(value);
        }

    }

    private void sortIntegers()
    {

        Collections.sort(numbers);
    }

    public void run()
    {
        inputIntegers();
        sortIntegers();
        displayIntegers();

    }

    public static void main(String[] args) {
        new Example4().run();

    }

}
