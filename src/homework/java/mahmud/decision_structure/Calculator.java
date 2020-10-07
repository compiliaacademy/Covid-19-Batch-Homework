package homework.java.mahmud.decision_structure;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Press 1 for Addition. \nPress 2 for Subtraction. \nPress 3 for Multiplication. \nPress 4 for Division. \nPress 5  for Exit.");

        System.out.println("Please Enter Your Choice: ");
        int choice = reader.nextInt();


        switch(choice){
            case 1:

                System.out.println("Welcome to Addition World!!!");

                System.out.println("Please Enter Add1 number: ");
                int Add1=reader.nextInt();

                System.out.println("Please Enter Add2 number: ");
                int Add2=reader.nextInt();

                int First_result = Add1 + Add2;

                System.out.println("The Addition result is : " +First_result);

                break;


            case 2:

                System.out.println("Welcome to Subtraction World!!!");

                System.out.println("Please Enter Sub1 number: ");
                int Sub1=reader.nextInt();

                System.out.println("Please Enter Sub2 number: ");
                int Sub2=reader.nextInt();

                int Second_result1 = Sub1 - Sub2;
                int Second_result2 = Sub2 - Sub1;

                if (Sub1 > Sub2){
                    System.out.println("The Subtraction result is : " + Second_result1);
                }

                else if (Sub2 > Sub1){
                    System.out.println("The Subtraction result is : " + Second_result2);
                }

                break;

            case 3:
                System.out.println("Welcome to Multiplication World!!!");

                System.out.println("Please Enter Mul1 number: ");
                int Mul1=reader.nextInt();

                System.out.println("Please Enter Mul2 number: ");
                int Mul2=reader.nextInt();

                int Third_result = Mul1 * Mul2;

                System.out.println("The Multiplication result is : " + Third_result);
                break;

            case 4:
                System.out.println("Welcome to Division World!!!");

                System.out.println("Please Enter Div1 number: ");
                int Div1=reader.nextInt();

                System.out.println("Please Enter Div2 number: ");
                int Div2=reader.nextInt();

                int Forth_result = Div1 / Div2;

                System.out.println("The Division result is : " + Forth_result);
                break;

            case 5:
                System.out.println("Thank You for using the app!!!");
                System.exit(0);

            default:
                System.out.println("Wrong Choice. Try Again");

        }
    }
}


/*
 *   \n -- new line
 *   \t -- tab
 * */


/*
* 1. For loop
* 2. While loop
* 3. Do While loop
*/



