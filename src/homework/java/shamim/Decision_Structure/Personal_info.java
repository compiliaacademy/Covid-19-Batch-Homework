package homework.java.shamim.Decision_Structure;
import java.util.Scanner;

public class Personal_info {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the following information: ");
        String name, email, address;
        byte month_of_birth;
        boolean employed;
        double expected_salary;

        System.out.println("Please enter your name: ");
        name = reader.nextLine();

        System.out.println("Please enter your email: ");
        email = reader.nextLine();

        System.out.println("Please enter your address: ");
        address = reader.nextLine();

        System.out.println("Please enter your month of birth: ");
        month_of_birth = reader.nextByte();

        System.out.println("Please enter your employment status: ");
        employed = reader.nextBoolean();

        System.out.println("Please enter your expected salary: ");
        expected_salary = reader.nextDouble();

        System.out.println("Printed Information: ");
        System.out.println("--------------------");
        System.out.println("My name is: " + name);
        System.out.println("My email is: " + email);
        System.out.println("My address is: " + address);
        System.out.println("My expected salary is: $" + expected_salary +"/year");
        System.out.println("My month of birth is: " + month_of_birth);
        System.out.println("My employed staus is: " + employed);

    }
}
