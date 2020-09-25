package homework.java.jakir.Operators;

public class Exercise_9 {

    public static void main(String[] args) {
        short driven_the_car = 513;
        System.out.println("Car was driven : "+driven_the_car+" Miles");


        double used_gallons_of_gas = 30.03;
        System.out.println("Gas was used   : "+used_gallons_of_gas+" Gallon");


        double MPG = driven_the_car/used_gallons_of_gas;
        System.out.println("MPG            : "+MPG);
    }
}
