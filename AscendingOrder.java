/* A353
Aim
To write a Java program to arrange the elements of an array in ascending order.
Algorithm
Start the program.

Read the number of elements to be stored in the array.

Read the array elements from the user.

Compare each element with the remaining elements in the array.

Swap the elements if the current element is greater than the compared element.

Display the array elements in ascending order.

Stop the program. */

import java.util.Scanner;

public class 
AscendingOrder
{
public static void main(String[] args)
{
int n, temp;
Scanner s=new Scanner(System.in);
System.out.print("Enter number of elements you want in array:");n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if (a[i]>a[j])
{
temp=a[i];
a[j]=a[j];
a[j]=temp;
}
}
}
System.out.print("AscendingOrder:");
for (int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
}
}
/* Output
text
Enter number of elements you want in array: 5
Enter all the elements:
5 2 8 1 4
AscendingOrder:1,2,4,5,8
Result
Thus, the Java program to arrange the elements of an array in ascending order was executed successfully.*/
