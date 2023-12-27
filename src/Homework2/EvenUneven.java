package Homework2;

import java.util.Scanner;

public class EvenUneven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        scanner.close();

        String result = (number % 2 == 0) ? "even" : "uneven";
        System.out.println("Your number is " + result);
    }
}
