/*A353
Aim
To write a Java program to check whether a given year is a leap year or not.

Algorithm
Start the program.

Read a year from the user.

Initialize a Boolean variable flag to false.

If the year is divisible by 400, set flag to true.

Otherwise, if the year is divisible by 100, set flag to false.

Otherwise, if the year is divisible by 4, set flag to true.

Otherwise, set flag to false.

If flag is true, display that the year is a leap year.

Otherwise, display that the year is not a leap year.

Stop the program.*/
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        // Check leap year condition
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        // Output result
        if (flag) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }

        s.close();
    }
}
/*Output
text
Enter any year: 2024
Year 2024 is a leap year
Another output:

text
Enter any year: 1900
Year 1900 is not a leap year
Result
Thus, the Java program to check whether a given year is a leap year or not was executed successfully.
*/
