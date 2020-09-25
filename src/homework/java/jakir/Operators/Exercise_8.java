package homework.java.jakir.Operators;

public class Exercise_8 {

    public static void main(String[] args) {

        int total_perchase = 500;
        System.out.println("Total purchase :  $"+total_perchase);


        double county_sale_tax = 0.02* total_perchase;
        System.out.println("County sale tax:  $"+county_sale_tax);


        double state_sale_tax = 0.04 * total_perchase;
        System.out.println("State sale tax :  $"+state_sale_tax);


        double totalsaletax = county_sale_tax+state_sale_tax;
        System.out.println("Total sale tax :  $"+totalsaletax);
    }
}
