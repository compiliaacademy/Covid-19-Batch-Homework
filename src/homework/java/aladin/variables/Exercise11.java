package homework.java.aladin.variables;

public class Exercise11 {
    public static void main(String[] args) {


        final double profit_percentage = 0.4;
        double user_retail_price;
        double company_profit;

        user_retail_price = 4000;
        company_profit = profit_percentage * user_retail_price;

        System.out.println( "The profit earned on $" + user_retail_price + " is $" + company_profit);


    }
}
