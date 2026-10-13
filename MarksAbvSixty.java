/*A353
Aim
To write a Java program to input the names and marks of six students and display the names and marks of students who scored more than 60.

Algorithm
Start the program.

Declare an integer array to store the marks and a string array to store the names of six students.

Read the name and marks of each student.

Display the heading "Students scoring more than 60".

Check the marks of each student using a loop.

If a student's marks are greater than 60, display their name and marks.

Stop the program.*/
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
/*Output
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
Divya : 90*/
