package homework.java.salman.decision.structure;

public class lowest_number {
    public static void main(String[] args) {

        int num1 = 25, num2 = 77, num3 = 96, num4 = 125, num5 = 2;

        if ((num1 < num2) && (num1 < num3) && (num1 < num4) && (num1 < 5)) {
            System.out.println("num1 is the lowest number");
        } else if ((num2 < num1) && (num2 < num3) && (num2 < num4) && (num2 < num5)) {
            System.out.println("num2 is the lowest number");
        } else if ((num3 < num1) && (num3 < num2) && (num3 < num4) && (num3 < num5)) {
            System.out.println("num3 is the lowest number");
        } else if ((num4 < num1) && (num4 < num2) && (num4 < num3) && (num4 < num5)) {
            System.out.println("num4 is the lowest number");
        } else
            System.out.println("num5 is the lowest number");
    }

    }
