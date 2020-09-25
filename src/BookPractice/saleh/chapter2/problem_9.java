package BookPractice.saleh.chapter2;
import java.util.Scanner;
public class problem_9 {


        public static void main(String[] args)
        {

            double  miles_driven ;
            double  gallons_of_gas_used ;
            double  mpg;


            Scanner x = new Scanner(System.in);

            System.out.println("please enter miles you have driven");
            miles_driven        = x.nextDouble();
            System.out.println("please enter gallons of gas used ");
            gallons_of_gas_used = x.nextDouble();

            mpg = miles_driven/gallons_of_gas_used ;
            System.out.println("total MPG " + mpg);

        }
    }


