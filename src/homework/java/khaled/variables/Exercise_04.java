package homework.java.khaled.variables;

public class Exercise_04 {
    public static void main(String args[]){

        // 04. Name and Initials.

        String first_name = "Khaled";
        String middle_name = "Hasan";
        String last_name = "Khaled";

        char first_initial;
        char middle_initial;
        char last_initial;

        first_initial = first_name.charAt(0);
        middle_initial = middle_name.charAt(0);
        last_initial = last_name.charAt(0);

        System.out.println("Name: " + first_name + " " + middle_name + " " + last_name + ".");
        System.out.println("Initials: " + first_initial + "." + middle_initial + "." + last_initial + ".");


    }
}
