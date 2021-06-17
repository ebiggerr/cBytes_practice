package com.ebiggerr.easy;

import java.util.Scanner;

public class letterChanges {


    /**
     * Have the function letterChanges(str) take the str parameter being passed and
     * modify it using the following algorithm. Replace every letter in the string
     * with the letter following it in the alphabet (ie. c becomes d, z becomes a).
     * Then capitalize every vowel in this new string (a, e, i, o, u) and finally
     * return this modified string.
     * @param  {string} str
     * @return {string}
     */
    public static String letterChanges(String str){

        StringBuilder builder=new StringBuilder();

        for( Character c: str.toCharArray() ){
            if( c.equals('c')){
                builder.append('d');
            }
            if( c.equals('z')){
                builder.append('a');
            }
            if( c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u')  ){
                builder.append( Character.toUpperCase(c) );
            }
            builder.append(c);
        }

        return builder.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print( letterChanges(s.nextLine()) );
    }
}
