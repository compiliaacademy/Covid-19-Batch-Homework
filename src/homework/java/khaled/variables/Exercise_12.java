package homework.java.khaled.variables;

public class Exercise_12 {

    public static void main(String args[]) {

        String user_favorite_city;

        user_favorite_city = "Dhaka";//input have to a city name...

        System.out.println( "The number of characters in " + user_favorite_city + " is " +  user_favorite_city.length() + ".");
        System.out.println( user_favorite_city + " converted to upper case is " +  user_favorite_city.toUpperCase() + ".");
        System.out.println( user_favorite_city + " converted to lower case is " +  user_favorite_city.toLowerCase() + ".");
        System.out.println( "The first character in " + user_favorite_city + " is " + user_favorite_city.charAt( 0 ) + ".");

    }
}
