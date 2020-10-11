package BookPractice.saleh.chapter3;
import java.util.Scanner;
public class Problem_8 {
    public static void main(String[] args){
        int amount;
        int price;
        double discount ;
                discount = 0;
        Scanner x= new Scanner(System.in);
        System.out.println("please enter package ammount ");
        amount = x.nextInt();
        price = amount*99;

        if (amount>=100 ) {
            discount = price*0.5;
        }
        if (amount<=99 && amount>=50) {
            discount = price*0.4;
        }
        if (amount<=49 && amount>=20) {
            discount = price*0.3;
        }
        if (amount<=19 && amount>=10) {
            discount = price*0.2;
        }
        System.out.println("Congratulation you get $"+ discount +" discount");
    }

}
