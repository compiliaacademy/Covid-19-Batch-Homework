package homework.java.aladin.switchcase;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter a number between 0-5: ");
        int input = reader.nextInt();
        switch (input) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            default:
                System.out.println("The number you entered is not matching.. Try Again");
        }
    }
}



