/*A353
Aim
To write a Java Applet program to display ten buttons labeled A to J in a grid layout of 5 rows and 2 columns using the AWT package.

Algorithm
Start the program.
Import the java.awt and java.applet packages.
Create an Applet class named gld.
Override the init() method.
Set the layout to GridLayout(5, 2).
Create ten buttons labeled A, B, C, D, E, F, G, H, I, and J.
Add all ten buttons to the Applet.
Override the getInsets() method to provide a margin of 20 pixels on all sides.
Display the buttons in a grid layout.
Stop the program.*/
import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
/*<applet code="gld.class" height=300 width=300>
</applet>*/

public class gld extends Applet
{
public void init()
{
setLayout(new GridLayout(5,2));
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}}
/*Output
A window of size 300 × 300 pixels displaying ten buttons in 5 rows and 2 columns.

text
+----------------------+
|   A      |     B     |
|----------------------|
|   C      |     D     |
|----------------------|
|   E      |     F     |
|----------------------|
|   G      |     H     |
|----------------------|
|   I      |     J     |
+----------------------+
Result
Thus, the Java Applet program to display ten buttons using the GridLayout manager was written successfully.*/
