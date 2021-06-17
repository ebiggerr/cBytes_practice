package com.ebiggerr.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class codelandUsernameValidation {

    public static String codelandUsernameValidation(String str){

        Pattern pattern=Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
        Matcher matcher=pattern.matcher(str);

        if( matcher.matches()) return "true";
        return "false";
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print( codelandUsernameValidation(s.nextLine()) );
    }
}
