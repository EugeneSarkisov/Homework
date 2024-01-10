package Homework2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        //task 1
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        scanner.close();

        String result = (number % 2 == 0) ? "even" : "uneven";
        System.out.println("Your number is " + result);*/

        //task 2
       /* System.out.println("Enter the variable: ");
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
        */

        //task 3
       /* for (int i = 10; (i >=10) && (i<=20); i++ ){
            System.out.println(i * i);
        }
        */

        //task 4
        /*System.out.println("Enter the variable: ");

        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        scanner.close();

        if (temperature > -5){
            System.out.println("Warm");
        } else if (temperature <= -5 && temperature > -20){
            System.out.println("Normal");
        } else if (temperature >= -20){
            System.out.println("Cold");
        }*/

        //task 5
        /*System.out.println("Enter the int positive variable: ");
        Scanner scanner = new Scanner(System.in);
        boolean variable = scanner.hasNextInt();

        if (variable) {
            int trueVariable;
            trueVariable = scanner.nextInt();
            scanner.close();
            int counter = trueVariable;

            if (counter < 0) {
                System.out.println("Incorrect data!");
            } else {
                int variableCounter = trueVariable - 1;
                int finalResult = 0;
                while (counter > 0) {
                    finalResult += trueVariable - variableCounter;
                    trueVariable++;
                    counter--;
                }
                System.out.println("Your result is: " + finalResult);
            }
        } else {
            scanner.close();
            System.out.println("Incorrect data!");
        }*/
    }
}
