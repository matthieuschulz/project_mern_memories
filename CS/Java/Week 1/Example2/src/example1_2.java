public class example1_2 {

    private void displayFileContent(String filename)
    {
        FileInput fileIn =  new FileInput(filename);
        while (fileIn.hasNextLine())
        {
            String s = fileIn.nextLine();
            System.out.println(s);
        }
        fileIn.close(); // Closing file after it being used
    }

    private  String getFileName ()
    {
        Input in = new Input();
        System.out.print("Enter filename: ");
        String filename = in.nextLine();
        return filename;
    }

    public void showFile()
    {
        String filename = getFileName();
        displayFileContent(filename);

    }

    public static void main(String [] args)
    {
        new example1_2().showFile();
    }
}
