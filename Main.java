/*A353
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
Stop the program */
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
/*Output
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
*/
