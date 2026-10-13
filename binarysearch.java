/* A353
  Aim
To write a Java program to search for an element in a sorted array using the binary search technique.

Algorithm
Start the program.

Read the number of elements in the array.

Read the array elements in sorted order.

Read the element to be searched.

Initialize first = 0 and last = n - 1.

Calculate the middle position using mid = (first + last) / 2.

If the middle element equals the search element, display its position and stop searching.

If the middle element is smaller than the search element, set first = mid + 1.

Otherwise, set last = mid - 1.

Repeat steps 6 to 9 until the element is found or first > last.

If the element is not found, display "Element not found".

Stop the program. */  
import java.util.Scanner;

class BinarySearch
{
    public static void main(String args[])
    {
        int i, mid, first, last, x, n, flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in sorted order:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        x = sc.nextInt();

        first = 0;
        last = n - 1;

        while(first <= last)
        {
            mid = (first + last) / 2;

            if(a[mid] == x)
            {
                flag = 1;
                System.out.println("Element found at position " + (mid + 1));
                break;
            }
            else if(a[mid] < x)
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Element not found");
        }
    }
}
/*Output
text
Enter number of elements: 5
Enter elements in sorted order:
10 20 30 40 50
Enter element to search: 30
Element found at position 3
Result
Thus, the Java program to search for an element in a sorted array using the binary search technique was executed successfully.*/

