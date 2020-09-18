package homework.java.shamim.operators;

public class Exercise_5_17 {

    public static void main(String[] args) {


        // 5. Sum of two numbers

        int num1;  // Could be used as Byte variable also
        int num2;
        int total;

        num1= 62;
        num2= 99;
        total= num1+num2;

        System.out.println(" ");
        System.out.println("5. Sum of two numbers");
        System.out.print("Answer: ");
        System.out.println(total);
        System.out.println(" ");
        System.out.println(" ");

        // 6. Sales Prediction

        double percentage;
        double total_sales;
        double predicted_amount;

        percentage= 62.0/100;
        total_sales= 4.6*10*100000;
        predicted_amount= percentage*total_sales;

        System.out.println("6. Sales Prediction");
        System.out.print("Answer: ");
        System.out.println(predicted_amount);
        System.out.println(" ");
        System.out.println(" ");

        // 7. Land Calculation

        int acre_in_sft;
        double land_in_sft,land_in_acre;

        acre_in_sft= 43560;
        land_in_sft= 389767.0;
        land_in_acre= land_in_sft/acre_in_sft;

        System.out.println("7. Land Calculation");
        System.out.print("Answer: ");
        System.out.println(land_in_acre);
        System.out.println(" ");
        System.out.println(" ");


        // 8. Sales Tax

        double amount_of_purchase;
        double percentage_of_state_sales_tax;
        double state_sales_tax;
        double percentage_of_county_sales_tax;
        double county_sales_tax;
        double total_sales_tax;
        double total_of_the_sale;

        amount_of_purchase= (100);
        percentage_of_state_sales_tax= 4.0/100;
        state_sales_tax= percentage_of_state_sales_tax * amount_of_purchase;
        percentage_of_county_sales_tax= 2.0/100;
        county_sales_tax= percentage_of_county_sales_tax * amount_of_purchase;
        total_sales_tax= state_sales_tax + county_sales_tax;
        total_of_the_sale= amount_of_purchase + total_sales_tax;

        System.out.println("8. Sales Tax");
        System.out.println("Answer:");
        System.out.println("The amount of purchase is: "+amount_of_purchase);
        System.out.println("The state sales tax is: " + percentage_of_state_sales_tax * amount_of_purchase);
        System.out.println("The county sales tax is: "+ percentage_of_county_sales_tax * amount_of_purchase);
        System.out.println("The total sales tax is: "+total_sales_tax+" and");
        System.out.println("The total of the sale is: "+total_of_the_sale);
        System.out.println(" ");
        System.out.println(" ");

        // 9. Miles per gallon

        double miles_driven;
        double gallon_of_gas_used;
        double mpg;

        miles_driven= 100;
        gallon_of_gas_used= 4;
        mpg= miles_driven/gallon_of_gas_used;

        System.out.println("9. Miles per Gallon");
        System.out.println("Answer: MPG= "+mpg);
        System.out.println(" ");
        System.out.println(" ");

        // 10. Test Average

        int score1;
        int score2;
        int score3;
        double average;

        score1= 10;
        score2= 20;
        score3= 30;
        average= (score1 + score2 + score3) / 3.0;

        System.out.println("10. Test Average");
        System.out.println("Answer:");
        System.out.println("Test score 1 is: "+score1);
        System.out.println("Test score 2 is: "+score2);
        System.out.println("Test score 3 is: "+score3+" and");
        System.out.println("Their average test score is: "+average);
        System.out.println(" ");
        System.out.println(" ");

        // 11. Circuit Board Profit

        double amount_of_retail_price;
        double percentage_of_profit;
        double profit_earned;

        amount_of_retail_price= 100;
        percentage_of_profit= 40.0/100;
        profit_earned= amount_of_retail_price * percentage_of_profit;

        System.out.println("11. Circuit Board Profit");
        System.out.println("Answer: ");
        System.out.println("Profit earned from circuit board is: "+profit_earned);
        System.out.println(" ");
        System.out.println(" ");

        // 12. String Manipulator

        String city_name;
        int stringSize;
        String uppercase;
        String lowercase;
        char initial_of_city_name;

        city_name= "Dhaka";
        stringSize= city_name.length();
        uppercase= city_name.toUpperCase();
        lowercase= city_name.toLowerCase();
        initial_of_city_name= city_name.charAt(0);

        System.out.println("12. String Manipulator");
        System.out.println("Answer:");
        System.out.println("Name of my favourite city is: "+ city_name);
        System.out.println("Number of character in city name is: "+ stringSize);
        System.out.println("Name of the city in uppercase: "+ uppercase);
        System.out.println("Name of the city in lowercase: "+lowercase);
        System.out.println("First character in the city name is: "+ initial_of_city_name);
        System.out.println(" ");
        System.out.println(" ");

        // 13. Restaurant Bill

        double meal_charge;
        double percentage_of_tax;
        double percentage_of_tip;
        double total_bill;

        meal_charge= 100;
        percentage_of_tax= 6.75/100;
        percentage_of_tip= 15.0/100;
        total_bill= (meal_charge + meal_charge * percentage_of_tax) + (meal_charge+meal_charge * percentage_of_tax) * percentage_of_tip;

        System.out.println("13. Restaurant Bill:");
        System.out.println("Answer:");
        System.out.println("Meal charge: "+meal_charge);
        System.out.println("Tax amount: "+ meal_charge * percentage_of_tax);
        System.out.println("Tip amount: "+ (meal_charge + meal_charge * percentage_of_tax) * percentage_of_tip);
        System.out.println("Total bill: " + total_bill);
        System.out.println(" ");
        System.out.println(" ");

        // 14. Stock Commission

        double price_per_share;
        int number_of_share;
        double price_of_total_share;
        double percentage_of_broker_commission;
        //double amount_of_commission;

        price_per_share= 21.77;
        number_of_share= 600;
        price_of_total_share= price_per_share * number_of_share;
        percentage_of_broker_commission= 2.0/100;
        //amount_of_commission= price_of_total_share * percentage_of_broker_commission;

        System.out.println("14. Stock Commission:");
        System.out.println("Answer:");
        System.out.println("Amount paid for the stock: "+ price_of_total_share);
        System.out.println("The amount of commission: " + price_of_total_share * percentage_of_broker_commission);
        System.out.println("Total amount paid: " + (price_of_total_share + (price_of_total_share * percentage_of_broker_commission)));
        System.out.println(" ");
        System.out.println(" ");

        // 15. Energy Drink Consumption

        int number_of_customer_surveyed;
        double percentage_of_energy_drink_purchaser;
        int number_of_customer_purchase_energy_drink;
        double percentage_of_citrus_flavored_energy_drink_purchaser;
        int number_of_customer_purchase_citrus_flavored_energy_drink;

        number_of_customer_surveyed= 12467;
        percentage_of_energy_drink_purchaser= 14.0/100;
        number_of_customer_purchase_energy_drink= (int) (number_of_customer_surveyed * percentage_of_energy_drink_purchaser);
        percentage_of_citrus_flavored_energy_drink_purchaser= 64.0/100;
        number_of_customer_purchase_citrus_flavored_energy_drink= (int) (number_of_customer_purchase_energy_drink * percentage_of_citrus_flavored_energy_drink_purchaser);

        System.out.println("15. Energy Drink Consumption:");
        System.out.println("Answer:");
        //System.out.println("Number of customer who ourchase energy drink is : "+ (number_of_customer_surveyed * percentage_of_energy_drink_purchaser));
        System.out.println("Number of customer who ourchase energy drink is :" + number_of_customer_purchase_energy_drink);
        //System.out.println("Number of customer who prefer citrus flavored energy drink is : "+ ((number_of_customer_surveyed * percentage_of_energy_drink_purchaser) * percentage_of_citrus_flavored_energy_drink_purchaser));
        System.out.println("Number of customer who prefer citrus flavored energy drink is : " + number_of_customer_purchase_citrus_flavored_energy_drink);
        System.out.println(" ");
        System.out.println(" ");

        // 16. Word Game:

        String NAME, city, college, profession, type_of_animal, pet_name;
        Byte age;

        NAME= "SHAMIM";
        age= 32;
        city= "NEW YORK";
        college= "BANGLADESH AGRICULTURAL UNIVERSITY";
        profession= "SDET";
        type_of_animal= "CAT";
        pet_name= "KOKO";

        System.out.println("16. Word Game:");
        System.out.println(" ");
        System.out.println("There once was a person named " + NAME+" who lived in "+city+". At the age of "+age+",");
        System.out.println(NAME+" went to college at "+college+". "+NAME+" graduated and went to work as a");
        System.out.println(profession+". Then, "+NAME+" adopted a "+type_of_animal+" named "+pet_name+". They both lived");
        System.out.println("happily ever after!");
        System.out.println(" ");
        System.out.println(" ");

        // 17. Stock Transaction Program:

        int number_of_stock;
        double per_stock_purchase_price;
        double total_stock_purchase_price;
        double percentage_of_commission;
        double commission_on_purchase;
        double per_stock_sell_price;
        double total_stock_sell_price;
        double commission_on_sale;


        number_of_stock= 1000;
        per_stock_purchase_price= 32.87;
        total_stock_purchase_price= number_of_stock * per_stock_purchase_price;
        percentage_of_commission= 2.0/100;
        commission_on_purchase= total_stock_purchase_price * percentage_of_commission;
        per_stock_sell_price= 33.92;
        total_stock_sell_price= number_of_stock * per_stock_sell_price;
        commission_on_sale= total_stock_sell_price * percentage_of_commission;

        System.out.println("17. Stock Transaction Program:");
        System.out.println("Answer:");
        System.out.println("The amount of money Joe paid for the stock is $"+(total_stock_purchase_price + commission_on_purchase));
        System.out.println("The amount of commission joe paid his broker during purchase is $"+ commission_on_purchase);
        System.out.println("The amount of money that Joe sold his stock for $"+total_stock_sell_price);
        System.out.println("The amount of commission Joe paid his broker on sold price is $"+ commission_on_sale);
        System.out.println("Amount of profit/loss after selling Joe's stock is $"+(total_stock_sell_price - (total_stock_purchase_price + commission_on_purchase + commission_on_sale)));
        System.out.println(" ");
        System.out.println("THANK YOU");
        System.out.println("   By");
        System.out.println("S. M. MAHIUDDIN SHAMIM");
        // System.out.println();

    }
}
