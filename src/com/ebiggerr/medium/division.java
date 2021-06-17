package com.ebiggerr.medium;

public class division {


    /**
     * Problem: Have the function Division(num1,num2) take both parameters being passed and return the Greatest Common Factor.
     * That is, return the greatest number that evenly goes into both numbers with no remainder. For example: 12 and 16 both are divisible by 1, 2, and 4
     * so the output should be 4. The range for both parameters will be from 1 to 10^3.
     *
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int division( int num1 , int num2 ){


        if (num2 == 0) return num1;
        return division(num2, num1%num2);
    }

    public static void main(String[] args) {

        int a = 12;
        int b = 16;

        System.out.println( division(a,b) );

    }

}
