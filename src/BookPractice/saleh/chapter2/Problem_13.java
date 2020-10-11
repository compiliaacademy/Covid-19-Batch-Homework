package BookPractice.saleh.chapter2;
import java.util.Scanner;
public class Problem_13 {

        public static void main(String[] args)
        {

            double  total_meal ;      // for Retail_price
            double  tax;             //  for tax
            double  tip;             //  for tip
            double  total;             //  for avg

            Scanner x = new Scanner(System.in);

            System.out.println("please enter the total meal charged");

            total_meal  =  x.nextDouble();
            tax         =  total_meal*0.0675;
            tip         =  (total_meal+tax)*.15;
            total       =  total_meal+tax+tip;

            System.out.println("total meal charged is $"+total_meal+ " tax is $"+tax+" tip is $"+tip+" total $"+ total);

        }
}
