package homework.java.sabina.Decision;

public class Decision_Structure {
    public static void main(String[] args) {
        int num1 = 20, num2 = 30, num3 = 40, num4 = 70, num5 = 50;

        if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) { //true -- true -- false
            System.out.println("Num1 is the largest number");
        } else if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)) { // true -- false
            System.out.println("Num2 is the largest number");
        } else if ((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)) { // true -- true --true --t
            System.out.println("Num3 is the largest number");
        } else if ((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)) {
            System.out.println("Num1 is the largest number");
        } else {
            System.out.println("num5 is the largest number ");
        }
        System.out.println("This code is out of if statement ");

    }
}






