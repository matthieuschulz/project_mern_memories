public  class example1_1
{
    public int SumOfDigits(int n)
    {
        int sum = 0;
        n = Math.abs(n);

        while (n > 0)
        {
            sum += n % 10;
            n/= 10;
        }
        return  sum;
    }

    public void inputAndProcess()
    {
        int n = 0;
        Input in = new Input();
        while (true)
        {
            System.out.println("Type in an integer: ");
            if(in.hasNextInt())
            {
                n = in.nextInt();
                break;
            }
            in.nextLine();
            System.out.println("You did not type an integer, try again.");
        }
        System.out.println("The sum of the digits of " + n);
        System.out.println("is:" + SumOfDigits(n));
    }

    public void inputAndProcess2()
    {
        GUIInput input = new GUIInput();
        int n = input.readInt("Type an int: ");


        System.out.println("The sum of the digits of " + n);
        System.out.println("is:" + SumOfDigits(n));

    }

    // Main method

    public static void main(String[] args)
    {
        example1_1 example1_1 = new example1_1();
        new example1_1().inputAndProcess2();
    }
}


