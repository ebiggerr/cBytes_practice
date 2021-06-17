package com.ebiggerr.easy;

import java.util.Scanner;

public class snakeCase {

    public static String SnakeCase(String str) {

        StringBuilder builder=new StringBuilder();
        char[] array= str.toCharArray();

        for( int index=0; index<str.length(); index++){
            if( array[index] == ' ' ) {
                index++;
                builder.append('_');
            }
            if( !Character.isLetterOrDigit(array[index])){
                index++;
                builder.append('_');
            }
            builder.append( Character.toLowerCase(array[index]) );
        }

        return builder.toString();
    }

    public static String function(String str){

        return str;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print( SnakeCase(s.nextLine()) );
    }
}
