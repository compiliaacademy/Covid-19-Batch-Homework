package homework.java.shamim.operators;

public class Exercise_1_4 {
    public static void main(String[] args) {

        // 1. Name,Age and Annual Income

        String name;
        Byte age; //it could be also done with int variable but as it is a small number, I preferred byte
        double annual_income;

        name= "S. M. Mahiuddin Shamim.";
        age= 32;
        annual_income= 100000.0;


        System.out.println(" ");
        System.out.println("1. Name,Age and Annual Income");
        System.out.print("My name is " + name);
        System.out.println(" I am "+age+ " years old and");
        System.out.println("I hope to earn $"+annual_income+ " per year");
        System.out.println(" ");
        System.out.println(" ");



        // 2. Personal Information

        String address, telephone_number, college_major, Email, house_street, city, state;  // String name was used already that's why if I use it again it shows error
        int zip_code;


        name= "S. M. Mahiuddin Shamim";
        address= "86-07 kingston place, Jamaica, NY, 11432";
        //address= "house & street: 86-07 kingston place, city: Jamaica, state: NY, zip code: 11432";
        //house_street= "86-07 kingston place,";
        //city= "Jamaica,";
        //state= "NY,";
        //zip_code= 11432;
        telephone_number= "929-218-3526";
        college_major= "Agricultural Science";
        Email= "mahiuddins27@gmail.com";


        System.out.println("2. Personal Information:");
        System.out.println("Name: "+ name);
        System.out.println("Address: "+address);
        //System.out.println("Address: "+ house_street+" "+city+" "+state+" "+zip_code);
        System.out.println("Telephone number: "+telephone_number);
        System.out.println("College major: "+college_major);
        System.out.println("Email: "+Email);
        System.out.println(" ");
        System.out.println(" ");


        // 3. Pattern

        System.out.println("3. Pattern");
        System.out.println(" ");
        System.out.print("   *   ");System.out.print("     ");System.out.println("   *   ");
        System.out.print("  ***  ");System.out.print("     ");System.out.println("  ***  ");
        System.out.print(" ***** ");System.out.print("     ");System.out.println(" ***** ");
        System.out.print("*******");System.out.print("     ");System.out.println("*******");
        System.out.print(" ***** ");System.out.print("     ");System.out.println(" ***** ");
        System.out.print("  ***  ");System.out.print("     ");System.out.println("  ***  ");
        System.out.print("   *   ");System.out.print("     ");System.out.println("   *   ");
        System.out.println(" ");
        System.out.println(" ");

        // Saney vi please don"t mind for double pattern. I thought that if I could build the same pattern side by side that"s why i did it.


        // 4. Name and Initials:

        String firstname= "S. M.";
        String middlename= "Mahiuddin";
        String lastname= "Shamim";
        char firstinitial= 'S';
        char middleinitial= 'M';
        char lastinitial= 'S';


        System.out.println("4. Name and Initials:");
        System.out.println("Name: "+firstname+" "+middlename+" "+lastname);
        System.out.println("Initials: "+firstinitial+" "+middleinitial+" "+lastinitial);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("THANK YOU");


    }
}
