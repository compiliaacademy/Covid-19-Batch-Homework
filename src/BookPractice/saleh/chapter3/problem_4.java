package BookPractice.saleh.chapter3;
import java.util.Scanner;
public class problem_4 {
    public static void main(String[] args) {
        double number;
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter avg number ");
        number = x.nextDouble();

        if (number >= 90) {
            System.out.println('A');
        }
        if (number >= 80 && number <= 89) {
            System.out.println('B');
        }
        if (number >= 70 && number <= 79) {
            System.out.println('C');
        }
        if (number >= 60 && number <= 69) {
            System.out.println('D');
        }
        if (number < 60) {
            System.out.println('F');
        }
    }
}