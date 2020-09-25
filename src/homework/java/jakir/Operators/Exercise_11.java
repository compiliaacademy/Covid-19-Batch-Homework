package homework.java.jakir.Operators;

public class Exercise_11 {

    public static void main(String[] args) {

        int Retail_price_of_circuit_boards = 173;
        System.out.println("Retail price of circuit boards: "+Retail_price_of_circuit_boards);

        double profit_as_percentage = 40.0;


        double percent_of_profit = profit_as_percentage/Retail_price_of_circuit_boards;
        System.out.println("Percentage of Profit          : "+percent_of_profit);

        double profit = Retail_price_of_circuit_boards * percent_of_profit;
        System.out.println("Profit earned for Product     : "+profit);

    }
}
