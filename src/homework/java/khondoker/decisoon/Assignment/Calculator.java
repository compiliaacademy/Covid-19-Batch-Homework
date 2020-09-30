package homework.java.khondoker.decisoon.Assignment;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please Press 1 (ONE) for Addition.\nPlease Press 2 (TWO) for Deletion.\nPlease Press 3 (THREE) for Multiplication.\nPlease Press 4 (FOUR) for Division.\nPress 5 for Exit.");
        System.out.println("Please Enter Your Choice: ");
        int choice;                 // Variable Declaration
        choice= reader.nextInt();   // Variable Initialization by user
        switch(choice) {
            case 1: {
                System.out.println("Welcome to Addition World!!!");
                System.out.println("Please Enter 1st number: ");
                int num1 = reader.nextInt();
                System.out.println("Please Enter 2nd number: ");
                int num2 = reader.nextInt();
                int result = num1 + num2;
                System.out.println("The Addition result is : " + result);
            }
            case 2: {
                System.out.println("Welcome to Deletion World!!!");
                System.out.println("Please Enter 1st number: ");
                int num3 = reader.nextInt();
                System.out.println("Please Enter 2nd number: ");
                int num4 = reader.nextInt();
                int result1 = num3 - num4;
                System.out.println("The Deletion result is : " + result1);
            }
            break;
            case 3: {
                System.out.println("Welcome to Multiplication World!!!");
                System.out.println("Please Enter 1st number: ");
                int num5 = reader.nextInt();
                System.out.println("Please Enter 2nd number: ");
                int num6 = reader.nextInt();
                int result2 = num5 * num6;
                System.out.println("The Multiplication result is : " + result2);}
            break;
            case 4: {
                System.out.println("Welcome to Division World!!!");
                System.out.println("Please Enter 1st number: ");
                int num7 = reader.nextInt();
                System.out.println("Please Enter 2nd number: ");
                int num8 = reader.nextInt();
                int result3 = num7 / num8;
                System.out.println("The Division result is : " + result3);}
            break;
            case 5:
                System.out.println("Thank You for using the app!!!");
                System.exit(0);
            default:
                System.out.println("Wrong Choice. Try Again");
}}}
