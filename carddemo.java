/*11249A353
Aim:
To write and execute a Java Applet program using the CardLayout class to display multiple buttons one at a time and switch between them when a button is clicked.
  
Algorithm
Start the program.
Import the required Java packages: java.io, java.awt, java.applet, and java.awt.event.
Declare a class named carddemo that extends Applet and implements ActionListener.
Declare three Button objects (b1, b2, b3), a Panel, and a CardLayout object.
Create the panel in the init() method.
Create a CardLayout object and set it as the layout manager of the panel.
Create three buttons:
First Button
Second Button
Third Button
Register an ActionListener for each button.
Add all three buttons to the panel using CardLayout with their respective names.
When any button is clicked, the actionPerformed() method is called.
Use buttonCardLayout.next(buttonPanel) to display the next card.
Repeat the process whenever a button is clicked.
Stop the program.*/


import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}
/*Result
The Java Applet program using CardLayout is executed successfully. It displays three buttons one at a time.Whenever the displayed button is clicked, the next button appears. 
After the third button, the layout returns to the first button.
*/
