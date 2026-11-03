/*A353
Aim
To write and execute a Java Applet program to arrange ten buttons in a 5 × 2 grid layout using the GridLayout manager.

Algorithm
Start the program.Import the required Java packages.
Create a class named gld that extends the Applet class.
Define the init() method.
Set the layout manager to GridLayout(5,2).
Create ten buttons with labels A, B, C, D, E, F, G, H, I and J.
Add all ten buttons to the applet using the add() method.
Override the getInsets() method to set a 20-pixel margin on all sides.
Display the buttons in a 5 × 2 grid format.
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
/* result : 
Thus, the Java Applet program to arrange ten buttons in a 5 × 2 grid layout using the GridLayout manager was executed successfully and the desired output was obtained.*/
