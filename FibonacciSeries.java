/*A353
Aim
To write a Java program to generate the Fibonacci series up to the given number of terms using a method.

Algorithm
Start the program.
Read the value of n from the user.
Call the fibonacci(n) method.
If n is 0, display 0.
If n is 1, display 0 1.
Otherwise, initialize the first two Fibonacci numbers as 0 and 1.
Calculate the next number by adding the previous two numbers.
Display the next number and update the previous two numbers.
Repeat the process until the required number of terms is generated.
Stop the program.*/  
import java.util.Scanner; public class FibonacciSeries {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter the value of n: "); int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n) { if (n == 0) {
System.out.println("0");
} else if (n == 1) { System.out.println("0 1");
} else {
System.out.print("0 1 "); int a = 0;
int b = 1;
for (int i = 1; i < n; i++) { int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}
/*Output
text
Enter the value of n: 5
0 1 1 2 3 5
Result
Thus, the Java program to generate the Fibonacci series using a method was executed successfully.
*/
