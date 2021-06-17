package com.ebiggerr.easy;

import java.util.HashSet;
import java.util.Scanner;

public class vowelCount {

    public static int vowelCount(String str){

        int counter=0;

        HashSet<Character> hashSet=new HashSet<>();
        hashSet.add('a');
        hashSet.add('e');
        hashSet.add('i');
        hashSet.add('o');
        hashSet.add('u');

        for( int index=0; index< str.length(); index++){

            if( hashSet.contains( Character.toLowerCase( str.charAt(index) ) )){
                counter++;
            }
        }
        return counter;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print( vowelCount(s.nextLine()) );
    }
}
