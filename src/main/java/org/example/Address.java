package org.example;

public class Address {

    String country;
    String city;
    String street;
    String flatNumber;
    String zipCode;

    public Address() {
    }
    public Address(String country, String city, String street, String flatNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.flatNumber = flatNumber;
        this.zipCode = zipCode;
    }
}
