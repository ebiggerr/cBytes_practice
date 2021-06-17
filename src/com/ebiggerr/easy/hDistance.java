package com.ebiggerr.easy;

public class hDistance {

    public static int hDistance( String[] arr){

        char[] str1= arr[0].toCharArray();
        char[] str2= arr[1].toCharArray();

        int counter=0;
        for( int index=0; index< arr[0].length(); index++ ){

            if( str1[index] != str2[index] ) counter++;

        }

        return counter;
    }

    public static void main(String[] args) {

        String[] arr= new String[]{"abcsd","abcde"};

        System.out.println( hDistance(arr));

    }
}
