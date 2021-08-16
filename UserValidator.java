package com.userregistration;

import java.util.regex.Pattern;

public class UserValidator {
    public static final String namePattern = "^[A-Z]{1}[a-z]{2,}$";
    public static final String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*" +
                                                "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    public static final String mobNumberPattern = "^(91(\s){0,1})(\\d{10})$";
    public static final String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]{1}).{8,}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(fname).matches();
    }

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(lname).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(emailPattern);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobNumber(String mobNumber) {
        Pattern pattern = Pattern.compile(mobNumberPattern);
        return pattern.matcher(mobNumber).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(passwordPattern);
        return pattern.matcher(password).matches();
    }
}
