package BookPractice.saleh.chapter2;
import java.util.Scanner;
public class Problem_10 {
    public static void main(String[] args)
    {

        double  first_number ;      // for first_number
        double  second_number;     // for second_number
        double  third_number;     // for third_number
        double  total;            // for total three number
        double  avg;             //  for avg

        Scanner x = new Scanner(System.in);

        System.out.println("please enter the first number");

        first_number   =   x.nextDouble();
        System.out.println("please enter the second number");
        second_number  =   x.nextDouble();
        System.out.println("please enter the  number");
        third_number   =   x.nextDouble();

        total          =   first_number+second_number+third_number;
        avg            =   total/3;

        System.out.println(" "+avg+" ");

    }
}
