package com.exception_handling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRagistration {
    // Uc1 = As a User need to enter a valid First Name = First name starts with Cap and has minimum 3 characters
    public boolean firstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$"); // Regix for valid first name.
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.find() == true) {
            return matcher.matches();      // passing to test cases if condition is true.
        } else {
            throw new InvalidUserInputException("Enter valid First Name"); // throw exception if conditioon is false.
        }
    }
}

