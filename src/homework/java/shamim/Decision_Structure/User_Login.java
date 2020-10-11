package homework.java.shamim.Decision_Structure;

import java.util.Scanner;

public class User_Login {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String validusername = "Shamim", validpassword = "Pass123";
        String uname, pass;

        System.out.println("Please enter your username: ");
        uname = reader.nextLine();
        System.out.println("Please enter your password: ");
        pass = reader.nextLine();

        if (uname.equals(validusername)) {{
            System.out.println("Username valid but password not valid....");
        }
            if (uname.equals(validpassword)){
                System.out.println("Username not valid but password valid....");
            }
            else {
                System.out.println("Username and password both are not valid....");
            }}
        else {
            System.out.println("Login successful....");
        }


    }
}
