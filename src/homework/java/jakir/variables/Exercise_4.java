package homework.java.jakir.variables;

public class Exercise_4 {

    public static void main(String[] args) {
        String firstname,middlename,lastname;
        firstname = "MD";
        middlename = "Komol";
        lastname = "Khan";

        char firstInitial = 'M';
        char middleInitial = 'K';
        char lastInitial = 'H';

        char Mdkomolkhan[]= {'M','K','H'};

        System.out.println("******Name******");
        System.out.println("First name: "+firstname);
        System.out.println("Middlename: "+middlename);
        System.out.println("Lastname: "+lastname);
        System.out.println();
        System.out.println("********Name initial**********");
        System.out.println("FirstInitial: "+firstInitial);
        System.out.println("MiddleInitial: "+middleInitial);
        System.out.println("LastInitial: " +lastInitial);
        System.out.println();
        System.out.println("******** Md komol khann initial**********");
        System.out.print(firstInitial);
        System.out.print(middleInitial);
        System.out.print(lastInitial);
        System.out.println();
        //System.out.println();
        System.out.println("*********OR***********");
        System.out.println(Mdkomolkhan);

    }
}
