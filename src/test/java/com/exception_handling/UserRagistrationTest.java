package com.exception_handling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserRagistrationTest {
    UserRagistration user = new UserRagistration();
    @Test
    void firstName(){
        try {
            boolean output = user.firstName("Abhishek");
            assertEquals(true, output);
        } catch (InvalidUserInputException e) {      // handling exception here if test case failed.
            System.out.println(e);
        }
    }
    @Test
    void lastName() {
        try {
            boolean output = user.lastName("Magdum");
            assertEquals(true, output);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }
    @Test
    void validEmail() {
        try {
            boolean output = user.validEmail("abhishek.magdum.07@gmail.com");
            assertEquals(true, output);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }
    @Test
    void phoneNumber() {
        try {
            boolean output = user.phoneNumber("+91 7066987376");
            assertEquals(true, output);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }
    @Test
    void password() {
        try {
            boolean output = user.password("Abhi@1234");
            assertEquals(true, output);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
            "abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    void allEmails(String emails) {
        try {
            boolean output = user.allEmails(emails);
            assertEquals(true, output);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }
}
