package org.example;
public class JavaTypes {
    public static void main(String[] args) {
        // System.out.println - use it for printing data to console
        System.out.println("Java types");
        // put anything inside comments
        // base java types
        // for numbers
        // int is for storing just numbers
        // age is variable
        int age = 10;
        System.out.println(age);
        age = 15;
        System.out.println(age);
        // age = "mariusz"; wrong code
        String myName = "mariusz";
        System.out.println(myName);
        myName = "maniek";
        System.out.println(myName);
        System.out.println("My name is: " + myName);
        String surname = "Pastuszka";
        System.out.println("My surname is: " + surname);
        // I'm name - surname
        System.out.println("I'm " + myName + " - " + surname);
        System.out.println("Now let's play with characters");
        // char is for storing just single characters
        char singleLetter = 'a';
        String singleLetterString = "a";
        System.out.println("Minimum int number is: " + Integer.MIN_VALUE);
        System.out.println("Maximum int number is: " + Integer.MAX_VALUE);
        long biggerNumber = 1;
        System.out.println("Minimum long number is: " + Long.MIN_VALUE);
        System.out.println("Maximum long number is: " + Long.MAX_VALUE);
        // short
        short smallNumber = 1;
        System.out.println("Minimum short number is: " + Short.MIN_VALUE);
        System.out.println("Maximum short number is: " + Short.MAX_VALUE);
        // byte
        byte byteNumber = 1;
        System.out.println("Minimum byte number is: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte number is: " + Byte.MAX_VALUE);
        boolean trueOrFalse = true;
        trueOrFalse = false;
        System.out.println("boolean variable current value: " + trueOrFalse);
        age = 30;
        boolean isAdult = age >= 18;
        System.out.println("isAdult current value: " + isAdult);
    }
}