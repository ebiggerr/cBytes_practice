package com.ebiggerr;

public class loop {

    public static void main(String[] args) {

        for( int index = 1; index <= 50; index++){

            if( (index % 3 == 0 ) && ( index % 5 ==0 ) ) System.out.println("HE");
            else if( index % 5 ==0 ) System.out.println("E");
            else if( ( index % 3 == 0 ) ) System.out.println("H");
            else{
                System.out.println( index);
            }





        }



    }
}
