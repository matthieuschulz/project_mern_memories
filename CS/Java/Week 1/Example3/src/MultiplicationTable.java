//Write a one-class program that uses a method to display
// a multiplication table, given an integer between 2 and 12 inclusive.
// The program should ask the user which table to display and reject any invalid request.

//Program to display multiplication Table

import java.sql.SQLOutput;

public class MultiplicationTable
{


//Display multiplication table for n.
  private void displayTable(final int n)
  {
      int counter = 1;
      System.out.println("The " + n + " multiplication table");

      while(counter < 13)
      {
          System.out.print(counter + " x " + n);
          System.out.println("= " + counter * n);
          counter += 1;
      }

  }

  // input table to be displayed + get it displayed

    public void doTable()
    {
        Input in = new Input();
        System.out.print("Which table(2-12) ?");
        int x = in.nextInt();

        run(x);
    }

    public void run(int x)
    {
        if ((x < 2) ||(x > 12))
        {
            System.out.println("Cannot display the table");

        }
        else
        {
            displayTable(x);
        }
    }

    public static void main(String[] args) {
        new MultiplicationTable().doTable();
    }

}