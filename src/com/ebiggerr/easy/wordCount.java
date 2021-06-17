package com.ebiggerr.easy;

import java.util.Scanner;

public class wordCount {

    /**
     * Have the function wordCount(str) take the str string parameter being passed
     * and return the number of words the string contains (e.g. "Never eat shredded
     * wheat or cake" would return 6). Words will be separated by single spaces.
     * @param str
     * @return int word count
     */
    public static int wordCount(String str){

        if( str == null || str.equals("")){
            return 0;
        }
        return str.split(" ").length;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print( wordCount(s.nextLine()) );
    }
}
