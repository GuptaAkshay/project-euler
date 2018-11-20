package io.guptaakshay.problems;

import java.util.List;

// Sum of Multiples of 3 and 5 below 1000
public class Problem1
{
    public static void main( String[] args )
    {
        int n = 1000;
        int sumMultiplesOf3And5 = 0;
        for (int i=0; i < 1000; i++){
            if(i%3==0 || i%5==0){
                sumMultiplesOf3And5 +=i;
            }
        }
        System.out.println( sumMultiplesOf3And5);
    }
}
