/*A353
Aim
To write a Java program to demonstrate the implementation of an interface using a class.

Algorithm
Start the program.
Declare an interface named Animal with an abstract method sound().
Create a class named Dog that implements the Animal interface.
Define the sound() method in the Dog class to display "Dog Barks".
Create an object of the Dog class in the main method.
Call the sound() method using the object.
Stop the program.*/
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
/*Output
text
Dog Barks
Result
Thus, the Java program to demonstrate the implementation of an interface was executed successfully.*/
