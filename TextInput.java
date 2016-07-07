/*
 *  Testing and practicing the text input for Java
 *  Includes usage of java.util.scanner class
 */

import java.util.*;

public class TextInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}