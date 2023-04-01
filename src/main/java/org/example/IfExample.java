package org.example;

public class IfExample {
    public static void main(String[] args) {
        System.out.println("Now, let's talk about if");

        int age = 18;

        if (age >= 18) {
            // if condition is true execute this block of code
            System.out.println("You are adult!!!");
            System.out.println("Go party");
        } else {
            // if condition is false execute this block of code
            System.out.println("Wait few more years:)");
            System.out.println("Go home");
        }
    }
}
