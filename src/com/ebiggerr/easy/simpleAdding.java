package com.ebiggerr.easy;

import java.util.Scanner;

public class simpleAdding {

    /**
     * Have the function simpleAdding(num) add up all the numbers from 1 to num. For
     * example: if the input is 4 then your program should return 10 because 1 + 2 +
     * 3 + 4 = 10. For the test cases, the parameter num will be any number from 1
     * to 1000.
     * @param  {number} num
     * @return {number}
     */
    public static int simpleAdding(int num){


        return ( num*(num+1) / 2 );

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print( simpleAdding( s.nextInt()) );
    }
}
