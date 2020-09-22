package homework.java.jakir.Decision_Structure;

public class FindLargestNumber {

    public static void main(String[] args) {

        int  num1=25, num2 =77, num3 =96, num4=125, num5=2;

        if((num1>num2)&&(num1>num3)&&(num1>num4)&&(num1>num5)) {
            System.out.println("The largest number is: 25");
        }
        else if((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5)){
            System.out.println("The largest number is: 77");

        }
        else if((num3>num1)&&(num3>num2)&&(num3>num4)&&(num3>num5)){
            System.out.println("The largest number is: 96");

        }
        else if((num4>num1)&&(num4>num2)&&(num4>num3)&&(num4>num5)) {

            System.out.println("The largest number is: 125");
        }

        else {
            System.out.println("The largest number is: 2");

        }
    }
}
