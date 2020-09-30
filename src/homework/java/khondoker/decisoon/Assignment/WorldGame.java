package homework.java.khondoker.decisoon.Assignment;
import java.util.Scanner;
public class WorldGame {
public static void main(String args[]){
Scanner reader = new Scanner(System.in);
    String name,city,college,profession,animal,animalName;      // Variable Declaration
    byte age;                                                   // Variable Declaration
    System.out.println("Please Enter your full name ");
        name = reader.nextLine();                               // Variable Initialization By User
    System.out.println("Please Enter The name of your city ");
        city =reader.nextLine();                                // Variable Initialization By User
    System.out.println("Please Enter your age ");
        age= reader.nextByte();                                 // Variable Initialization By User
    reader.nextLine();
    System.out.println("Please Enter The name of your University/College ");
        college = reader.nextLine();                            // Variable Initialization By User
    System.out.println("Please Enter Your profession ");
        profession= reader.nextLine();                          // Variable Initialization By User
    System.out.println("Please Enter what kind of animal you have as a pet ");
        animal = reader.nextLine();                             // Variable Initialization By User
    System.out.println("Please enter the name of your animal ");
        animalName= reader.nextLine();                              // Variable Initialization By User
    System.out.println("Once there was a person name "+name + " who lived in "+city+ ". \nAt the age of "+age+ ". "+name+ " went to "+college +" University. "+ name +" graduated and went to work as " +profession+". \nThen "+ name+ " adopted a " +animal+" named " + animalName+". They both lived happily ever after.");
}
}
