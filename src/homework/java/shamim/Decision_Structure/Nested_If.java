package homework.java.shamim.Decision_Structure;

import java.util.Scanner;
public class Nested_If {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String validusername = "Shamim";
        String validpassword = "Pass123";

        String uname,pass;

        System.out.println("Please enter your username: ");
        uname = reader.nextLine();

        if (uname.equals(validusername)){{
            System.out.println("Please enter your password: ");
            pass = reader.nextLine();}
            if (pass.equalsIgnoreCase(validpassword)){
                System.out.println("Login successful.");}
            else {
                System.out.println("Username is valid but password invalid....");
            }}
        else {
            System.out.println("Username not valid....");
        }
    }
}

