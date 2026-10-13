/*A353
Aim
To write a Java program to check whether a given number is even or odd using a switch statement.

Algorithm
Start the program.

Declare an integer variable n.

Read a number from the user.

Calculate the remainder when the number is divided by 2 using n % 2.

Use a switch statement to check the remainder.

If the remainder is 0, display "This number is even".

If the remainder is 1, display "This number is odd".

Stop the program.*/
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {

            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
/*Output
text
Enter a number: 8
This number is even
Another output:

text
Enter a number: 7
This number is odd
Result
Thus, the Java program to check whether a given number is even or odd using a switch statement was executed successfully. */
