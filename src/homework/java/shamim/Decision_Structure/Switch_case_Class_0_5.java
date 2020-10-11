package homework.java.shamim.Decision_Structure;
import java.util.Scanner;

public class Switch_case_Class_0_5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number between 0_5: ");

        int input = reader.nextInt();
        switch (input){

            case 0:{
                System.out.println("Zero");
            }break;
            case 1:{
                System.out.println("One");
            }break;
            case 2:{
                System.out.println("Two");
            }break;
            case 3:{
                System.out.println("Three");
            }break;
            case 4:{
                System.out.println("Four");
            }break;
            case 5:{
                System.out.println("Five");
            }break;
            default:
                System.out.println("Wrong input......Please try again. ");
                System.exit(0);
        }

    }
}
