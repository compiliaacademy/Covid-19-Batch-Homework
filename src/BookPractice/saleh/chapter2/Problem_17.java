package BookPractice.saleh.chapter2;

public class Problem_17 {
    public static void main(String[] args)
    {
        double  total_shares         =   1000;
        double  buying_st_price      =   32.87;
        double  buying_amount        =   total_shares * buying_st_price;
        double  buy_comm             =   buying_amount * 0.02;
        double  total_buying_amount  =   buy_comm + buying_amount;


        double  selling_st_price     =   33.92;
        double  selling_amount       =   total_shares * selling_st_price;
        double  selling_comm         =   selling_amount * 0.02;
        double  total_selling_amount =   selling_comm  + buying_amount;

        double profit                =  total_selling_amount - total_buying_amount;

        System.out.println("TOTAL AMOUNT OF MONEY JOE GET FOR THE STOCK $"+ total_buying_amount);
        System.out.println("TOTAL COMMISSION TO BUY $"+ buy_comm);
        System.out.println("TOTAL AMOUNT OF MONEY JOE PAID FOR THE STOCK $"+ total_selling_amount);
        System.out.println("TOTAL COMMISSION TO SELL $"+ selling_comm);
        System.out.println("TOTAL JOE'S PROFIT $"+ profit);

    }
}
