package homework.java.saleh.decisionStructure;
import java.util.Scanner;
public class Homework1 {
    public static void main(String[]args){
        int number;
        Scanner x = new Scanner(System.in);
        System.out.println("please enter your number#");
        number = x.nextInt();
        if(number % 2 == 0){
            System.out.println("This is even number#");
        } else
        {
            System.out.println("This is odd number#");
        }

    }
}
