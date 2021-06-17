package com.ebiggerr.easy;

import java.util.Scanner;

public class simpleSymbols {

      /*
    Using the Java language, have the function SimpleSymbols(str)
    take the str parameter being passed and determine if it is an
    acceptable sequence by either returning the string true or false.
    The str parameter will be composed of + and = symbols with several
    letters between them (ie. ++d+===+c++==a) and for the string to be true each
    letter must be surrounded by a + symbol. So the string to the left would be false.
    The string will not be empty and will have at least one letter.
    */
    public static boolean simpleSymbols(String str){

        // edge cases
        if (Character.isLetter(str.charAt(0)) || Character.isLetter(str.charAt(str.length()-1)))
            return false;

        // middle cases
        for (int i = 1; i < str.length()-1; i++)
            if (Character.isLetter(str.charAt(i)) && (str.charAt(i-1) != '+' || str.charAt(i+1) != '+'))
                return false;

        return true;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print( simpleSymbols(s.nextLine()) );
    }
}
