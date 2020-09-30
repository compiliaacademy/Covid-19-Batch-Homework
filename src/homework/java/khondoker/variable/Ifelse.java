package homework.java.khondoker.variable;

public class Ifelse {
    public static void main (String []args) {
        int num1=20, num2=30,num3=40,num4=50,num5=70;

        if ((num1>num2) && (num1>num3) && (num1>num4) && (num1>num5)){
        System.out.println("num1 is the latgest number");}
        else if ((num2>num1) && (num2>num3) && (num2>num4) && (num2>num5)){
        System.out.println("num2 is the latgest number");}
        else if ((num3>num1) && (num3>num2) && (num3>num4) && (num3>num5)){
        System.out.println("num3 is the latgest number");}
        else if ((num4>num1) && (num4>num3) && (num4>num3) && (num4>num5)){
        System.out.println("num4 is the latgest number");}
        else
            System.out.println("num5 is the latgest");



}
}
