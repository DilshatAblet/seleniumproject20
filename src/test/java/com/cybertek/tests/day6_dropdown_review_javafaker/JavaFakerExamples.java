package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {

    @Test
    public void faker_test(){

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        System.out.println("First Name: "+firstName);

        String lastName = faker.name().lastName();
        System.out.println("Last Name: "+lastName);

        String fullName = faker.name().fullName();
        System.out.println("Full Name: "+fullName);

        String address = faker.address().fullAddress();
        System.out.println("Address is: "+address);

        String house = faker.gameOfThrones().house();
        String quote = faker.gameOfThrones().quote();

        System.out.println("House: "+house);
        System.out.println("quote: "+quote);

        String fact = faker.chuckNorris().fact();
        System.out.println("fact: "+fact);

        System.out.println(faker.shakespeare().romeoAndJulietQuote());

    }



}
