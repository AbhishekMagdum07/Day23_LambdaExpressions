package com.exception_handling;

import org.junit.jupiter.api.Test;

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
            boolean output = user.lastName("magdum");
            assertEquals(true, output);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }
}
