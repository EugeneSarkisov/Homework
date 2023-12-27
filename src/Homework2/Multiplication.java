package Homework2;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter the variable: ");
        Scanner scanner = new Scanner(System.in);
        int variable = scanner.nextInt();
        scanner.close();

        int a = 14;
        int b = 1;
        int result;

        while (a <= 14 && a > 0) {
            result = variable * b;
            System.out.print(result + " ");
            a--;
            b++;
        }
        System.out.println();
        System.out.println("Multiplication complete.");
    }
}
