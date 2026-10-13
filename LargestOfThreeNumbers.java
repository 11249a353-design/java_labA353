/*A353
Aim
To write a Java program to find the largest among three integers using if-else-if statements.

Algorithm
Start the program.

Declare three integer variables x, y, and z.

Read three integers from the user.

If x is greater than both y and z, display "First number is largest".

Otherwise, if y is greater than both x and z, display "Second number is largest".

Otherwise, if z is greater than both x and y, display "Third number is largest".

If none of the above conditions is true, display "The numbers are not distinct or equal".

Stop the program.*/
import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}
/*Output
text
Enter three integers:
25
15
10
First number is largest
Another output:

text
Enter three integers:
10
30
20
Second number is largest
Result
Thus, the Java program to find the largest among three integers using if-else-if statements was executed successfully.*/
