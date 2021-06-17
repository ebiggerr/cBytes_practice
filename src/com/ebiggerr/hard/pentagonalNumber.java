package com.ebiggerr.hard;

import java.util.Scanner;

public class pentagonalNumber {

    public static String pentagonalNumber(int num){


        int result = (int) ( 5*(Math.pow( num,2) ) + 5*num + 2  ) /2;

        return String.valueOf(result);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( pentagonalNumber(1 ) );


    }
}
