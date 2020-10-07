package homework.java.mahmud.operators;

public class Assignment_1 {
    public static void main(String args[]) {
        // Sales Prediction
        double num1 = 62;
        int num2 = 100;
        double percentage = num1 / num2;
        System.out.println(percentage);
        double totalSale = (4.6 * 19) * 100000;
        System.out.println(totalSale);
        double profit = percentage * totalSale;
        System.out.println(profit);

        // Land calculation

        int oneacre = 43560;
        double totalsqf = 389767;
        double result= totalsqf /oneacre;
        System.out.println(result);

        // Sales Tax
        double purchase=24000;
        double statetax=0.04;
        double countrytax=0.02;
        double totalsalestax=(24000*0.04)+(24000*0.02);

        System.out.println(purchase);
        System.out.println(totalsalestax);

        // Miles per Gallon

        double milesdrive=240;
        int pergallon=23;
        double MPG=milesdrive/pergallon;
        System.out.println(MPG);

        // Test Average

        int firstscore=84;
        int secondscore=94;
        int thirdscore=100;
        int numberscore=3;
        int testavaragescore=(firstscore+secondscore+thirdscore)/numberscore;
        System.out.println(firstscore);
        System.out.println(secondscore);
        System.out.println(thirdscore);
        System.out.println(testavaragescore);

        // Circuit Board Profit

        int retailprice_perunit= 12;
        double totalunit_sale=240;
        double profitmergin=0.4;
        double Totalprofit=(240*12*0.4);
        System.out.println(Totalprofit);

        // String Manipulator

        String city_Name="New york";
        String city_Name_uper="NEW YORK";
        String city_Name_Lower="new york";
        char first_Character_Name_city='N';
        System.out.println("New york");
        System.out.println("NEW YORK");
        System.out.println("new york");
        System.out.println('N');

        // Restaurant Bill

        int meal=120;
        double Tax=(120*6.75/100);
        double Tip=(120*15/100);
        double TotalBill=120+(120*6.75/100)+(120*15/100);
        System.out.println("Meal:"+meal);
        System.out.println("Tax:"+Tax);
        System.out.println("Tip:"+Tip);
        System.out.println("Total Bill:"+TotalBill);

        // Stock Commission

        double Amount_paid_without_commission=(600*21.77);
        double Amount_of_commission=(600*21.77*.02);
        double Total_Amount_Paid=Amount_paid_without_commission+Amount_of_commission;
        System.out.println("Amount_paid_without_commission:"+Amount_paid_without_commission);
        System.out.println("Amount_of_commission:"+Amount_of_commission);
        System.out.println("Total_Amount_Paid:"+Total_Amount_Paid);

        // Energy Drink Consumption

        double Purchase_drink_perweek= (12467*.14);
        double citrus_flovored_drinks=(12464*.14*.64);
        System.out.println("Purchase_drink_perweek:"+Purchase_drink_perweek);
        System.out.println("citrus_flovored_drinks:"+citrus_flovored_drinks);

        // Word Game

        String name,city,college,profession,animal,petsname;
        short age;

        name="Kazi A Islam";
        city="Austin";
        college="City University of New York Baruch college";
        profession="Data Analyst";
        animal="cat";
        petsname="Reymen";
        age=40;

        System.out.println("There one was a person name " +name+ " who lived in " +city+".At the age of "+age+" "+name+" went to college at "+college +"."+name+" graduated and went to work as a "+profession+"."
                +"Then,"+name+" adopted a "+animal+" named "+petsname+"."+"They both lived happily ever after!");

        // Stock Transaction program

        double cost_of_share=1000*32.87;
        double Paid_to_Brocker= cost_of_share+(cost_of_share*0.02);
        double paid_commission_whenBought=cost_of_share*0.02;
        double sold_of_share=1000*33.92;
        double paid_commission_whensold=sold_of_share*0.02;
        double Total_Received_after_commission=sold_of_share-(sold_of_share*0.02);
        double Profit_loss=Total_Received_after_commission-Paid_to_Brocker;
        // System.out.println("Total Paid Broker:"+ Paid_to_Brocker)
        // System.out.println("Total Received after paid commission :"+ Total_Received_after_commission);

        System.out.println("The amount of money Joe paid for the stock:"+ cost_of_share);
        System.out.println("The amount of commission Joe paid his broker when he bought the stock:"+ paid_commission_whenBought);
        System.out.println("The amount that Joe sold the stock for:"+ sold_of_share);
        System.out.println("The amount of commission Joe paid his broker when he sold the stock:"+ paid_commission_whensold);
        System.out.println("Display the amount of profit that Joe made after selling his stock and paying the two\n" +
                "commissions to his broker. (If the amount of profit that your program displays is a\n" +
                "negative number, then Joe lost money on the transaction:"+ Profit_loss);

























    }

}



