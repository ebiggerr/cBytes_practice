package com.ebiggerr.easy;

import java.util.Arrays;
import java.util.Comparator;

public class thirdGreatest {

    /**
     * Have the function thirdGreatest(strArr) take the array of strings stored in
     * strArr and return the third largest word within in. So for example: if strArr
     * is ["hello", "world", "before", "all"] your output should be world because
     * "before" is 6 letters long, and "hello" and "world" are both 5, but the
     * output should be world because it appeared as the last 5 letter word in the
     * array. If strArr was ["hello", "world", "after", "all"] the output should be
     * after because the first three words are all 5 letters long, so return the
     * last one. The array will have at least three strings and each string will
     * only contain letters.
     * @param
     * @return
     */
    public static String thirdGreatest(String[] array){

        //descending
        Arrays.sort( array, Comparator.comparingInt(String::length).reversed() );

        return array[2];
    }

    public static void main (String[] args) {

        String[] array=new String[] {"hello","world","after","all"};

        System.out.print( thirdGreatest(array) );
    }

}
