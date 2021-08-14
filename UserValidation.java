package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Enter your First Name: ");
        System.out.println("Enter your Last Name: ");
        Scanner S = new Scanner(System.in);
        String fname = S.next();
        String lname = S.next();

        String regex1 = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex1);

        Matcher matcher1 = pattern1.matcher(fname);
        Matcher matcher2 = pattern2.matcher(lname);

        System.out.println(fname + " : " + matcher1.matches());
        System.out.println(lname + " : " + matcher2.matches());
    }
}