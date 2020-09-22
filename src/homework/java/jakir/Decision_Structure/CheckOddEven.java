package homework.java.jakir.Decision_Structure;

public class CheckOddEven {
    public static void main(String[] args) {

        int num1= 5;

        if (num1 % 2 == 0) {
            System.out.println(num1+" is the even number.");
        }
        else if(num1 % 2 != 0){
            System.out.println(num1+" is the odd number.");
        }
        else{
            System.out.println("BYE");
        }

    }
}
