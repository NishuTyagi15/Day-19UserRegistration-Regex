package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Enter your First Name: ");
        System.out.println("Enter your Last Name : ");
        Scanner S = new Scanner(System.in);
        String fname = S.next();
        String lname = S.next();

        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fname);

        System.out.println(fname + " : " + matcher.matches());
        System.out.println(lname + " : " + matcher.matches());
    }
}