package homework.java.khondoker.decisoon.Assignment;
import java.util.Scanner;
public class ScannerPrintNumberIn
{
public static void main(String[] args)
    {
Scanner reader = new Scanner(System.in);
    int number;                                                             // Variable Declaration
System.out.println("Please enter any number between zero to nine");
        number = reader.nextInt();                                          // Variable Initialization By User
        if (number == 0)                {
        System.out.println("Zero");     }
                else if (number == 1)       {
                System.out.println("One");  }
                else if (number == 2)       {
                System.out.println("Two");  }
                else if (number == 3)       {
                System.out.println("Three");}
                else if (number == 4)       {
                System.out.println("Four"); }
                else if (number == 5)       {
                System.out.println("Five"); }
                else if (number == 6)       {
                System.out.println("Six");  }
                else if (number == 7)       {
                System.out.println("Seven");}
                else if (number == 8)       {
                System.out.println("Eight");}
                else if (number == 9)       {
                System.out.println("Nine"); }
        else                            {
        System.out.println("Others");   }

    }
}