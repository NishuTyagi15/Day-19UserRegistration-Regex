package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Enter your First Name: ");
        System.out.println("Enter your Last Name: ");
        System.out.println("Enter your E-mail Address: ");
        System.out.println("Enter your Mobile Number with Country Code: ");
        System.out.println("Enter your Password: ");
        Scanner S = new Scanner(System.in);
        String fname = S.nextLine();
        String lname = S.nextLine();
        String email = S.nextLine();
        String mobNumber = S.nextLine();
        String pass = S.nextLine();

        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        String regex2 = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+
                         "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        String regex3 = "^(91(\s){0,1})(\\d{10})$";
        String regex4 = "[0-9a-zA-z]{8,}";

        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex1);
        Pattern pattern3 = Pattern.compile(regex2);
        Pattern pattern4 = Pattern.compile(regex3);
        Pattern pattern5 = Pattern.compile(regex4);

        Matcher matcher1 = pattern1.matcher(fname);
        Matcher matcher2 = pattern2.matcher(lname);
        Matcher matcher3 = pattern3.matcher(email);
        Matcher matcher4 = pattern4.matcher(mobNumber);
        Matcher matcher5 = pattern5.matcher(pass);

        System.out.println(fname + " : " + matcher1.matches());
        System.out.println(lname + " : " + matcher2.matches());
        System.out.println(email + " : " + matcher3.matches());
        System.out.println(mobNumber + " : " + matcher4.matches());
        System.out.println(pass + " : " + matcher5.matches());
    }
}