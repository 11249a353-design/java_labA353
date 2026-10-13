/*A353
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
Stop the program.   */
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
/*Output
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
Thus, the Java program to demonstrate various string operations was executed successfully.*/


