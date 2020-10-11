package BookPractice.saleh.chapter2;

public class Problem_14 {
    public static void main(String[] args)
    {

        int     stock           =   600;
        double  price           =   21.77;
        double  total           = stock * price;
        double  commission      =   total*0.02;
        double  total_amount    = commission +total;

        System.out.println("total stocks price $"+ total+ " total commission $"+total+" total ammount $"+total_amount  );

    }
}
