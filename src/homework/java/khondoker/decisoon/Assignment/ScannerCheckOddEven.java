package homework.java.khondoker.decisoon.Assignment;
import java.util.Scanner;
public class ScannerCheckOddEven {
public static void main(String args[]) {
Scanner reader=new Scanner(System.in);
    int num;                                                    // Variable Declaration
    System.out.println("Please enter an integer number");
        num= reader.nextInt();                                  // Variable Initialization By User
        if (num % 2 == 0)                                   {
            System.out.println("Entered number is even");   }
        else                                                {
            System.out.println("Entered number is odd");    }
        System.out.println("THANK YOU FOR YOUR INPUT");
    }
    }