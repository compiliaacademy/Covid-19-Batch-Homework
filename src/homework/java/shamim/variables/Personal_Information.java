package homework.java.shamim.variables;

public class Personal_Information {

    public static void main(String[] args) {

        String name;
        String email;
        String address;
        double expected_salary;
        byte month_of_birth;
        boolean employed;

        name= "Shamim";
        email= "mahiuddins27@gmail.com";
        address= "86-07 kingston pl,jamaica,NY";
        expected_salary= 80000.00;
        month_of_birth= 12;
        employed= false;



        System.out.println("printing information");
        System.out.println("--------------------");
        System.out.println("My name is:" + name);
        System.out.println("My email is:" + email);
        System.out.println("My address is: + address");
        System.out.println("My expected salary is:" + expected_salary );
        System.out.println("My month of birth is:" + month_of_birth);
        System.out.println("My employed staus is:" + employed);


    }
}
