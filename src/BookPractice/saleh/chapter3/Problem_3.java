package BookPractice.saleh.chapter3;
import java.util.Scanner;
public class Problem_3 {
    public static void main(String[]args){
        float hight;
        float weight;
        float bmi;

        Scanner x = new Scanner(System.in);
        System.out.println("Please enter Your hight in inches");
        hight = x.nextFloat();
        System.out.println("Please enter Your weight");
        weight= x.nextFloat();
        float xyz = hight*hight; // i tried like bmi = ((weight*703/hight*hight) but not working properly
        bmi = (weight*703/xyz);

        System.out.println("You are BMI "+bmi );

        if(bmi<=18.5){
            System.out.println("You are underweight");
        } else if(bmi>=25.0)
        {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are optimal weight");
        }
    }
}
