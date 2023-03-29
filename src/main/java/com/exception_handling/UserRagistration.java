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
    // Uc2 = As a User need to enter a valid Last Name = Last name starts with Cap and has minimum 3 characters
    public boolean lastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.find() == true) {
            return matcher.matches();      // passing to test cases if condition is true.
        } else {
            throw new InvalidUserInputException("Enter valid Last Name"); // throw exception if conditioon is false.
        }
    }
    // Uc3 = As a User need to enter a valid email
    //E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) wit precise @ and . positions
    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-z][a-z0-9-.+]*@[a-z0-9]*[.][a-z.]*$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find() == true) {
            return matcher.matches();      // passing to test cases if condition is true.
        } else {
            throw new InvalidUserInputException("Enter valid Email Address"); // throw exception if conditioon is false.
        }
    }
}

