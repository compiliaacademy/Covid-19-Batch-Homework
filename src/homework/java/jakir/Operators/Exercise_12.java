package homework.java.jakir.Operators;

public class Exercise_12 {

    public static void main(String[] args) {
        String favorite_city = "Dhaka";



        int number_of_character = favorite_city.length();
        System.out.println("Total Number of character of city name: "+number_of_character);


        String uppercase = favorite_city.toUpperCase();
        System.out.println("Upper case letter of the city name    : "+uppercase);


        String lowercase = favorite_city.toLowerCase();
        System.out.println("Lower case letter of the city name    : "+lowercase);


        char first_char_of_city = favorite_city.charAt(0);
        System.out.println("First charcter of city name           : "+first_char_of_city);


    }
}
