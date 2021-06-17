package com.ebiggerr.easy;

import java.util.Scanner;

public class timeConvert {

    public static String timeConvert(String str){

        int hours= Integer.parseInt(str)/60;
        int minutes = Integer.parseInt(str) % 60;

        return new String( hours + ":" + minutes);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print( timeConvert(s.nextLine()) );
    }
}
