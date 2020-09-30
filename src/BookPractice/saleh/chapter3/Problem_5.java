package BookPractice.saleh.chapter3;
import java.util.Scanner;
public class Problem_5 {
    public static void main(String[]args){
        double mass;
        double weight;

        Scanner x = new Scanner(System.in);
        System.out.println("Please enter mass in KG");
        mass  = x.nextDouble();
        weight = mass*9.8;

        if (weight<10){
            System.out.println("This weight is "+weight +"N and it is too light");
        } else if(weight>1000){
            System.out.println("This weight is "+weight +"N and it is too havey");
        }else{
            System.out.println("This weight OK");
        }

    }
}
