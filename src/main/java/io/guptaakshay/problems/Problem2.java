package io.guptaakshay.problems;


//Sum of Even fibonacci below 4000000
public class Problem2
{
    public static void main( String[] args )
    {
        Integer limit = 4000000;
        System.out.println( calculateEvenFibonacci( limit ) );

    }

    public static Long calculateEvenFibonacci(Integer limit){
        Long evenFib1 = 0L;
        Long evenFib2 = 2L;
        Long evenFib3 = 0L;
        Long sum = evenFib1+evenFib2;
        if(limit < 2)
            return 1L;

        while(evenFib2 <= limit){

            evenFib3 = 4 * evenFib2 + evenFib1;

            if(evenFib3>limit)
                break;

            evenFib1 = evenFib2;
            evenFib2 = evenFib3;
            sum += evenFib3;
        }

        return sum;
    }
}
