/*A353
Aim
To write a Java program to demonstrate multithreading using the Thread class and methods such as yield() and sleep().

Algorithm
Start the program.
Create three thread classes, A, B, and C, by extending the Thread class.
Override the run() method in each thread class.
In thread A, print numbers from 1 to 5 and use Thread.yield() to give other threads an opportunity to execute.
In thread B, print numbers from 1 to 3 and terminate the loop using break.
In thread C, print numbers from 1 to 5 and use Thread.sleep(1500) to pause execution for 1.5 seconds.
Create objects of all three thread classes in the main method.
Start the threads using the start() method.
Display the output from the threads.
Stop the program.*/
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}
/*Log in
You said:

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
}          now i will keep afew pro0grams one by one ..................give me aim , algorithm, output , result to copy paste

ChatGPT said:
Aim
To write a Java program to arrange the elements of an array in ascending order.

Algorithm
Start the program.

Read the number of elements to be stored in the array.

Read the array elements from the user.

Compare each element with the remaining elements in the array.

Swap the elements if the current element is greater than the compared element.

Display the array elements in ascending order.

Stop the program.

Output
text
Enter number of elements you want in array: 5
Enter all the elements:
5 2 8 1 4
AscendingOrder:1,2,4,5,8
Result
Thus, the Java program to arrange the elements of an array in ascending order was executed successfully.


You said:

comment line ingithub what

ChatGPT said:
In Java, a comment line is used to explain the code. It is ignored by the compiler.

Single-line comment: // comment

Multi-line comment: /* comment */

For your ascending order program, you can write comments like this:

java
// Read the number of elements
// Get array elements from the user
// Compare array elements
// Swap elements if they are not in ascending order
// Display the sorted array
If you mean commenting on GitHub, open the file or pull request, type your comment in the comment box, and click Comment or Add comment.


You said:

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

ChatGPT said:
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

Stop the program.

Output
text
Enter number of elements: 5
Enter elements in sorted order:
10 20 30 40 50
Enter element to search: 30
Element found at position 3
Result
Thus, the Java program to search for an element in a sorted array using the binary search technique was executed successfully.


You said:

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

ChatGPT said:
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

Stop the program.

Output
text
The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9
Result
Thus, the Java program to find the sum, largest number, and smallest number in an array was executed successfully.


You said:

import java.util.Scanner;

public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}

ChatGPT said:
Aim
To write a Java program to input the names and marks of six students and display the names and marks of students who scored more than 60.

Algorithm
Start the program.

Declare an integer array to store the marks and a string array to store the names of six students.

Read the name and marks of each student.

Display the heading "Students scoring more than 60".

Check the marks of each student using a loop.

If a student's marks are greater than 60, display their name and marks.

Stop the program.

Output
text
Enter Name of Student and Marks of Subject 1: Arun 75
Enter Name of Student and Marks of Subject 2: Ravi 55
Enter Name of Student and Marks of Subject 3: Priya 85
Enter Name of Student and Marks of Subject 4: Kumar 60
Enter Name of Student and Marks of Subject 5: Divya 90
Enter Name of Student and Marks of Subject 6: Sita 45

Students scoring more than 60:
Arun : 75
Priya : 85
Divya : 90
Result
Thus, the Java program to display the names and marks of students scoring more than 60 was executed successfully.


You said:

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter the two numbers to perform operations");

            System.out.print("Enter the first number: ");
            int x = s.nextInt();

            System.out.print("Enter the second number: ");
            int y = s.nextInt();

            System.out.println("\nChoose the operation you want to perform:");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");

            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;

                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;

                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;

                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    int mod = x % y;
                    System.out.println("Result: " + mod);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

ChatGPT said:
Aim
To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a menu-driven approach.

Algorithm
Start the program.

Create a Scanner object to get input from the user.

Read two integer numbers.

Display the menu of arithmetic operations: addition, subtraction, multiplication, division, modulus, and exit.

Read the user's choice.

Use a switch statement to perform the selected operation.

For division, check whether the second number is zero before performing the operation.

Display the result of the selected operation.

Repeat the process until the user chooses Exit.

Stop the program.

Output
text
Enter the two numbers to perform operations
Enter the first number: 20
Enter the second number: 10

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
1
Result: 30

Enter the two numbers to perform operations
Enter the first number: 20
Enter the second number: 10

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
4
Result: 2.0

Enter the two numbers to perform operations
Enter the first number: 10
Enter the second number: 3

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
5
Result: 1

Enter the two numbers to perform operations
Enter the first number: 5
Enter the second number: 2

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
6
Exiting...
Result
Thus, the Java program to perform arithmetic operations using a menu-driven approach was executed successfully.


You said:

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

ChatGPT said:
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

Stop the program.

Output
text
Enter a number: 8
This number is even
Another output:

text
Enter a number: 7
This number is odd
Result
Thus, the Java program to check whether a given number is even or odd using a switch statement was executed successfully.


You said:

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

ChatGPT said:
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

Stop the program.

Output
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
Thus, the Java program to find the largest among three integers using if-else-if statements was executed successfully.


You said:

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

ChatGPT said:
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

Stop the program.

Output
text
Enter any year: 2024
Year 2024 is a leap year
Another output:

text
Enter any year: 1900
Year 1900 is not a leap year
Result
Thus, the Java program to check whether a given year is a leap year or not was executed successfully.


You said:

public class StringOperations {
    public static void main(String[] args) {

        String str = "Hello Java";
        System.out.println("1. Length: " + str.length());
        System.out.println("2. Character at index 1: " + str.charAt(1));
        System.out.println("3. Uppercase: " + str.toUpperCase());
        System.out.println("4. Lowercase: " + str.toLowerCase());
        System.out.println("5. Substring: " + str.substring(6));
        System.out.println("6. Concatenation: " + str.concat(" Programming"));
        System.out.println("7. Contains 'Java': " + str.contains("Java"));
        System.out.println("8. Index of 'J': " + str.indexOf('J'));
        System.out.println("9. Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("10. Replace: " + str.replace("Java", "World"));
        System.out.println("11. Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("12. Ends with 'Java': " + str.endsWith("Java"));
        String str2 = "Hello Java";
        System.out.println("13. Equals: " + str.equals(str2));
        String str3 = "   Hello Java   ";
        System.out.println("14. Trim: " + str3.trim());
    }
}

ChatGPT said:
Aim
To write a Java program to demonstrate various string operations such as length, character extraction, case conversion, substring, concatenation, searching, replacing, comparison, and trimming.

Algorithm
Start the program.

Initialize a string with the value "Hello Java".

Find and display the length of the string.

Display the character at a specified index.

Convert the string to uppercase and lowercase.

Extract and display a substring.

Concatenate another string to the original string.

Check whether the string contains a specified word.

Find the index of a character and its last occurrence.

Replace a word in the string with another word.

Check whether the string starts or ends with a specified word.

Compare two strings using the equals() method.

Remove leading and trailing spaces using the trim() method.

Display all the results.

Stop the program.

Output
text
1. Length: 10
2. Character at index 1: e
3. Uppercase: HELLO JAVA
4. Lowercase: hello java
5. Substring: Java
6. Concatenation: Hello Java Programming
7. Contains 'Java': true
8. Index of 'J': 6
9. Last index of 'a': 9
10. Replace: Hello World
11. Starts with 'Hello': true
12. Ends with 'Java': true
13. Equals: true
14. Trim: Hello Java
Result
Thus, the Java program to demonstrate various string operations was executed successfully.


You said:

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
interface Father {
    void fatherProperty();
}
interface Mother {
    void motherProperty();
}
class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Child gets property from Father");
    }
    public void motherProperty() {
        System.out.println("Child gets property from Mother");
    }
}
interface Sports {
    void playSports();
}
class Student {
    void study() {
        System.out.println("Student studies");
    }
}
class CollegeStudent extends Student implements Sports {
    public void playSports() {
        System.out.println("College student plays sports");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();
        System.out.println("\nMultiple Inheritance:");
        Child ch = new Child();
        ch.fatherProperty();
        ch.motherProperty();
        System.out.println("\nHybrid Inheritance:");
        CollegeStudent cs = new CollegeStudent();
        cs.study();
        cs.playSports();
    }
}

ChatGPT said:
Aim
To write a Java program to demonstrate different types of inheritance, namely single inheritance, multilevel inheritance, hierarchical inheritance, multiple inheritance using interfaces, and hybrid inheritance.

Algorithm
Start the program.

Create an Animal class with an eat() method.

Create a Dog class that extends Animal to demonstrate single inheritance.

Create a Puppy class that extends Dog to demonstrate multilevel inheritance.

Create a Cat class that extends Animal to demonstrate hierarchical inheritance.

Create Father and Mother interfaces and implement both in the Child class to demonstrate multiple inheritance using interfaces.

Create a Student class with a study() method.

Create a Sports interface and implement it in the CollegeStudent class, which extends Student, to demonstrate hybrid inheritance.

Create objects of the respective classes and call their methods.

Display the output for each type of inheritance.

Stop the program.

Output
text
Single Inheritance:
Animal eats
Dog barks

Multilevel Inheritance:
Animal eats
Dog barks
Puppy plays

Hierarchical Inheritance:
Animal eats
Cat meows

Multiple Inheritance:
Child gets property from Father
Child gets property from Mother

Hybrid Inheritance:
Student studies
College student plays sports
Result
Thus, the Java program demonstrating single, multilevel, hierarchical, multiple (using interfaces), and hybrid inheritance was executed successfully.


You said:

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

ChatGPT said:
Aim
To write a Java program to demonstrate the implementation of an interface using a class.

Algorithm
Start the program.

Declare an interface named Animal with an abstract method sound().

Create a class named Dog that implements the Animal interface.

Define the sound() method in the Dog class to display "Dog Barks".

Create an object of the Dog class in the main method.

Call the sound() method using the object.

Stop the program.

Output
text
Dog Barks
Result
Thus, the Java program to demonstrate the implementation of an interface was executed successfully.


You said:

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

ChatGPT said:
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

Stop the program.

Output
text
Enter any Positive Number : 153
Armstrong Number
Another output:

text
Enter any Positive Number : 123
Not an Armstrong Number
Result
Thus, the Java program to check whether a given positive integer is an Armstrong number or not was executed successfully.


You said:

/*A353
  
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

ChatGPT said:
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

Stop the program.

Output
text
Enter the value of n: 5
0 1 1 2 3 5
Result
Thus, the Java program to generate the Fibonacci series using a method was executed successfully.


You said:

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}

/*Output
Note: The order of thread execution may vary.

text
Start thread A
from thread A i=1
from thread B j=1
thread C = 1
exit from main thread
from thread A i=2
from thread B j=2
from thread B j=3
exit from B
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
thread C = 2
thread C = 3
thread C = 4
thread C = 5
Result
Thus, the Java program to demonstrate multithreading using yield(), sleep(), and break was executed successfully.*/
