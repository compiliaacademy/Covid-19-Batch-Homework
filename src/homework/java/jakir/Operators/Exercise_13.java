package homework.java.jakir.Operators;

public class Exercise_13 {

    public static void main(String[] args) {

        double meal_charge = 173.50;
        System.out.println("Charge on meal before tax :"+meal_charge);


        double tax_as_percentage = 6.25;
        double total_tax_onMeal = (meal_charge*tax_as_percentage)/100;
        System.out.println("Tax amount                :"+total_tax_onMeal);


        double charge_on_meal_afterTax = meal_charge + total_tax_onMeal;

        byte tip_percentage = 15;
        double total_tip_as_sale = (charge_on_meal_afterTax*tip_percentage)/100;
        System.out.println("Tip amount                :"+total_tip_as_sale);


        double total_bill = meal_charge +  total_tax_onMeal+total_tip_as_sale;
        System.out.println("Total bill                :"+total_bill);

    }
}
