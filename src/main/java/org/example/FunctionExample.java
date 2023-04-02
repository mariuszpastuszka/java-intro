package org.example;

public class FunctionExample {

    public static void main(String[] args) {
        String words = "Hi, Welcome to intro to programming";
        System.out.println("Words before reversing the order of letters: " + words);
        // 1). Ho to create StringBuilder based on String
        StringBuilder reverseHelper = new StringBuilder(words);
        // 2). How to use reverse operation
        reverseHelper.reverse();

        String revertedWords = reverseHelper.toString();
        System.out.println(revertedWords);
    }
}
