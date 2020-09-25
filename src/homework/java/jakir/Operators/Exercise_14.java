package homework.java.jakir.Operators;

public class Exercise_14 {
    public static void main(String[] args) {

        double per_share = 21.77;
        double total_share_price = 600*per_share;
        System.out.println("Amount paid for the stocks                  : "+total_share_price);

        byte commission_percentage = 2;
        double total_commission =(total_share_price*commission_percentage)/100;
        System.out.println("Amount of commission                        : "+total_commission);

        double total_paid = total_share_price+total_commission;
        System.out.println("Total amount paid for stocks plus commission: "+total_paid);
    }
    }

