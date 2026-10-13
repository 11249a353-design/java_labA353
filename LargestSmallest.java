/*A353
 Aim
To write a Java program to find the sum, largest number, and smallest number in an array.

Algorithm
Start the program.

Initialize an array with the given elements.

Initialize sum = 0, min with the first array element, and max with the first array element.

Traverse through each element of the array.

If the current element is greater than max, update max.

If the current element is smaller than min, update min.

Add each element to sum.

Display the sum, largest number, and smallest number.

Stop the program. */
import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}
/*Output
text
The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9
Result
Thus, the Java program to find the sum, largest number, and smallest number in an array was executed successfully.
*/
