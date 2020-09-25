package BookPractice.saleh.chapter2;
import java.util.Scanner;
public class problem_11 {
    public static void main(String[] args)
    {

        double  Retail_price ;      // for Retail_price
        double  profit;             //  for avg

        Scanner x = new Scanner(System.in);

        System.out.println("please enter the Retail price");

        Retail_price   =   x.nextDouble();
        profit         =  Retail_price*0.4;

        System.out.println("total profit is $"+ profit);

    }
}
