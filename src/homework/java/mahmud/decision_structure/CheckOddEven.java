package homework.java.mahmud.decision_structure;

import java.util.Scanner;

public class CheckOddEven {
    public static void main (String[] arg){

  /*  int n = 10;
     if((n % 2)==0) {
         System.out.println("Even Number");
    } else {
        System.out.println("Odd Number");
    }
    { System.out.println("BYE");*/




        int num;
        System.out.println("Enter an Integer number:");

        //The input provided by user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        /* If number is divisible by 2 then it's an even number
         * else odd number*/
        if ( num % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}

