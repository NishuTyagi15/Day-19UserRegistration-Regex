package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Enter your First Name: ");
        String fname = new Scanner(System.in).next();

        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fname);

        System.out.println(fname + " : " + matcher.matches());
    }
}