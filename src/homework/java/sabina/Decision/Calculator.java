package homework.java.sabina.Decision;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Press 1 for addition.\n Press 2 for Division.\n Press 3 for Multiplication.\n Press 4 for Subtraction.\n Press 5 for Exit.");

        System.out.println("Please Enter your choice: ");
        int choice = reader.nextInt();

         switch (choice){

             case 1 :
             {
                 System.out.println("Welcome to addition World!!");

                 System.out.println("Please Enter 1st number:");
                  int num1 = reader.nextInt();

                 System.out.println("Please Enter 2nd number:");
                 int num2 = reader.nextInt();

                 int result = num1 + num2;

                 System.out.println("The additional result is: " + result );

                 break;
             }
             case 2 : {
                 System.out.println("Welcome to Division World!!");

                 System.out.println("Please Enter 1st number:");
                 int num1 = reader.nextInt();

                 System.out.println("Please Enter 2nd number:");
                 int num2 = reader.nextInt();

                 int result = num1 / num2;

                 System.out.println("The division result is:" + result);

                 break;
             }

             case 3 : {
                 System.out.println("Welcome to Multiplication World!!");

                 System.out.println("Please Enter 1st number:");
                 int num1 = reader.nextInt();

                 System.out.println("Please Enter 2nd number:");
                 int num2 = reader.nextInt();

                 int result = num1 * num2;

                 System.out.println("The Multiplication result is:" + result);

                 break;
             }

             case 4 : {
                 System.out.println("Welcome to subtraction World!!");

                 System.out.println("Please Enter 1st number:");
                 int num1 = reader.nextInt();

                 System.out.println("Please Enter 2nd number:");
                 int num2 = reader.nextInt();

                 int result = num1 - num2;

                 System.out.println("The subtraction result is:" + result);

                 break;
             }

             case 5 :
                 System.out.println("Thank You for using This App!!");
                 System.exit(0);

             default:
                 System.out.println("Wrong choice try again");





         }
    }
}
