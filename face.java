/*A353
Aim
To write and execute a Java Applet program to draw a human face using the Graphics class and its drawing methods.

Algorithm
Start the program.
Import the required Java packages: java.awt, java.io, and java.applet.
Create a class named face that extends the Applet class.
Override the paint(Graphics g) method.
Use drawOval() to draw the face, eyes, nose, and ears.
Use fillOval() to draw the pupils of the eyes.
Use fillArc() to draw the nose and mouth.
Display the face using the Graphics class.
Stop the program.*/
import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}
/*Result:

Thus, the Java Applet program to draw a human face using Graphics class methods was executed successfully and the desired output was obtained.*/
