package homework.java.khaled.loops;

import java.util.Scanner;

public class ForLoop_02 { // With using Scanner..

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
