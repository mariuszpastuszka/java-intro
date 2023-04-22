package org.example;

public class PersonExample {

    public static void main(String[] args) {
        System.out.println("Let's play with objects");

        Person mariusz = new Person();
        Person birgit = new Person();
        birgit.name = "birgit";


        System.out.println("mariusz name is: " + mariusz.name);
        mariusz.name = "mariusz";
        mariusz.surname = "pastuszka";
        mariusz.age = 40;

        System.out.println("Object after assigning some values");
        System.out.println("mariusz.name is " + mariusz.name);
        System.out.println("mariusz.address is: " + mariusz.personAddress);
        System.out.println("birgit.name is: " + birgit.name);

        mariusz.name = "maniek";
        System.out.println("mariusz.name is " + mariusz.name);
        System.out.println("birgit.name is: " + birgit.name);

        String person1Name;
        String person1Surname;
        int person1age;
    }
}
