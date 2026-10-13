/*A353
Aim
To write a Java program to read the contents of a file named sample2.txt using the FileReader class and display the contents on the console.

Algorithm
Start the program.
Create a FileReader object to open the file sample2.txt.
Declare an integer variable i to store the character read from the file.
Read each character using the read() method until the end of the file is reached (-1).
Convert each integer value into a character using type casting.
Display each character on a separate line using System.out.println().
Close the file using the close() method.
Handle exceptions using a try-catch block.
Stop the program.*/
import java.io.*; class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
/*Output
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
Result
Thus, the Java program to read and display the contents of a file using the FileReader class was executed successfully.*/
