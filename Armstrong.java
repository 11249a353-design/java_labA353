/*A353
Aim
To write a Java program to check whether a given positive integer is an Armstrong number or not.

Algorithm
Start the program.
Read a positive integer from the user.
Store the original number in the variable nu and initialize num = 0.
Extract the last digit of the number using nu % 10.
Calculate the cube of the digit and add it to num.
Remove the last digit using nu = nu / 10.
Repeat steps 4 to 6 until nu becomes zero.
Compare num with the original number n.
If both are equal, display "Armstrong Number"; otherwise, display "Not an Armstrong Number".
Stop the program.*/
import java.util.Scanner; public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : "); n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
}
}
/*Output
text
Enter any Positive Number : 153
Armstrong Number
Another output:

text
Enter any Positive Number : 123
Not an Armstrong Number
Result
Thus, the Java program to check whether a given positive integer is an Armstrong number or not was executed successfully.*/
