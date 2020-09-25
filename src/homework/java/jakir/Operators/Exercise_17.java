package homework.java.jakir.Operators;

public class Exercise_17 {

    public static void main(String[] args) {
        short shares = 1000;
        System.out.println("Total of shares Joe purchase                            : "+shares);
        double Joe_per_shares = 32.87;
        double total_pay_for_shares = 1000*Joe_per_shares;
        System.out.println("Amount of money Joe paid for all stock                  : $"+total_pay_for_shares);

        double Paid_commission_asBuyer = (2*total_pay_for_shares)/100;
        System.out.println("Amount of commission money Joe paid when he bought stock: $"+Paid_commission_asBuyer);

        double Joe_sold_per_share = 33.92;
        double Total_sold_amount = 1000 * Joe_sold_per_share;
        System.out.println("Amount of money Joe sold stock for                      : $"+Total_sold_amount);
        double paid_commission_as_Seller = (2*Total_sold_amount)/100;

        System.out.println("Amount of commission Joe paid when he sold stock        : $"+paid_commission_as_Seller);

        double lost_money = Total_sold_amount - (total_pay_for_shares+Paid_commission_asBuyer+paid_commission_as_Seller);
        System.out.println("Amount of money Joe lost on stock business              : $" +lost_money);

    }
}
