package homework.java.aladin.operators;

public class salesprediction {
    public static void main(String[]args) {
        double percentage;
        double total_sales;
        double predicted_amount;

        percentage = 62.0/100;
        total_sales = 4600000;
        predicted_amount = percentage * total_sales;

        System.out.println("East Coast Division Will Generate" +" " + "$" + predicted_amount);
    }
}
