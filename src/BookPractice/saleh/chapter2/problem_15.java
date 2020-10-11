package BookPractice.saleh.chapter2;

public class problem_15 {
    public static void main(String[] args)
    {
        int     total_surveyed          =   12467;
        int  purchased_customer      = (int) (total_surveyed*.14);
        int  c_f_customer           = (int) (purchased_customer*.64);


        System.out.println(purchased_customer+" customer purchased this product per week" );
        System.out.println(c_f_customer+" prefer citrus-flavored energy drinks" );

    }
}
