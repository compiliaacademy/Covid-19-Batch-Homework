package homework.java.aladin.decision.structure;

public class Exercise4 {
    public static void main(String[] args) {
        int num1 = 525, num2 = 987, num3 = 196, num4 = 2125, num5 = 112;

        //Find the Lowest Number using if else
        if ((num1 < num2) && (num1 < num3) && (num1 < num4) && (num1 < num5)) {
            System.out.println("The Lowest number is " + num1);
        }
        else if ((num2 < num1) && (num2 < num3) && (num2 < num4) && (num2 < num5)) {
            System.out.println("The Lowest number is " + num2);
        }
        else if ((num3 < num1) && (num3 < num2) && (num3 < num4) && (num3 < num5)) {
            System.out.println("The Lowest number is " + num3);
        }
        else if ((num4 < num1) && (num4 < num2) && (num4 < num3) && (num4 < num5)) {
            System.out.println("The Lowest number is " + num4);
        }
        else{
            System.out.println("The Lowest number is " + num5);
        }
    }

}
