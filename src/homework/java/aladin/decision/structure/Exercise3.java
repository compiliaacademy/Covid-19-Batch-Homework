package homework.java.aladin.decision.structure;

public class Exercise3 {
    public static void main(String[] args) {
        int num1 = 75, num2 = 87, num3 = 196, num4 = 225, num5 = 2;

        // Find the Largest Number
        if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
            System.out.println("The Largest number is number" + num1);
        }
        else if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)) {
            System.out.println("The Largest number is" + num2);
        }
        else if ((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)) {
            System.out.println("The Largest number is" +num3);
        }
        else if ((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)) {
            System.out.println("The Largest number is" + num4);
        }
        else{
            System.out.println("The Largest number is" + num5);
        }

    }
}
