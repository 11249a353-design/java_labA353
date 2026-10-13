/*A353
Aim
To write a Java program to create a file named sample2.txt and write the uppercase English alphabets from A to Z into the file using the FileWriter class.

Algorithm
Start the program.
Create a FileWriter object to open the file sample2.txt.
Use a for loop to generate characters from ASCII value 65 to 90.
Write each character into the file using the write() method.
Close the file using the close() method.
Handle any exceptions using a try-catch block.
Stop the program.*/
import java.io.*;

class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}
/*Output
The program does not display any output on the console.

Contents of sample2.txt:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
Result
Thus, the Java program to write uppercase English alphabets from A to Z into a file using the FileWriter class was executed successfully.*/
