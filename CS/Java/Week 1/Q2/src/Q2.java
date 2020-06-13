//Write a program to input 10 doubles (values of type double)
// and store them in an array.

// Then compute and display the average of the values input.
// Try entering negative as well as positive numbers.
// Consider writing one method to do the input and another to compute the average.

import java.util.ArrayList;

public class Q2
{

   public double[] inputDoubles()
   {

       Input input = new Input();
       double[] values = new double [10];

       for (int n = 0; n<values.length; n++)
       {
           System.out.println("Enter a double: ");
           values[n] = input.nextDouble();

       }
       return values;
   }


   public double Average(double[] values)
   {
     double sum = 0.0;
     for(double value: values)
     {
         sum += value;
     }
     return sum/values.length;
   }



   public void go()
   {
       double average  = Average(inputDoubles());
       System.out.println("The average is" + average);

   }


    public static void main(String[] args)
    {
        new Q2().go();
    }
}
