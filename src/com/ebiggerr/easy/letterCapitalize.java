package com.ebiggerr.easy;

import java.nio.charset.CharsetEncoder;
import java.util.Scanner;

public class letterCapitalize {

    /**
     * Have the function letterCapitalize(str) take the str parameter being passed
     * and capitalize the first letter of each word. Words will be separated by only
     * one space.
     * @param  {string} str
     * @return {string}
     */
    public static String letterCapitalize(String str){

        String[] arr = str.trim().split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print( letterCapitalize(s.nextLine()) );
    }
}
