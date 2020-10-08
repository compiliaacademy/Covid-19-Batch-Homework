package homework.java.aladin.forloop;

import java.util.Scanner;
import java.sql.SQLOutput;

public class forloop {
    public static void main(String[] args) {
       System.out.println("I am a Soccer player");
        System.out.println("I am a Soccer player");
      System.out.println("I am a Soccer player");
        System.out.println("I am a Soccer player");
        System.out.println("I am a Soccer player");

        System.out.println("---------------------");

        // To Print multiple times in one line coding
         for(int table = 1; table<=7;table ++) {
             System.out.println("I love Bangladesh");
         }

            System.out.println("---------------------");
        for(int table = 1; table<=12;table ++) {
            System.out.println(table);
        }

        System.out.println("---------------------");

        // Multiplication table which is Namta.

        Scanner reader = new Scanner (System.in);

            for(int table = reader.nextInt(); table<=10;table ++) {
                System.out.println(table + " X " + 1 + " = " + (table * 1));
            }

                for(int number = 1; number<=10; number ++) {
                    System.out.println(1 + "*" + number + "=" + (1 * number));
                }

// reviewed by Khaled Hasan. 

    }
}
