import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //task 1
        //System.out.println("Hello World!");

        //task 2
        /* System.out.println("Enter the username: ");
        Scanner username = new Scanner(System.in);
        String Name = username.nextLine();
        System.out.println("Hello " + Name + "!") ;*/

        //task 3
        /* System.out.println("Enter the value of b and c: ");
        Scanner options = new Scanner(System.in);
        int b = options.nextInt();
        int c = options.nextInt();
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a); */

        //task 4
        /* System.out.println("Enter the value: ");
        Scanner variable = new Scanner(System.in);
        int a = variable.nextInt();
        int b = a / 10;
        int c = a % 10; //((-10 * b) + a);
        int d = b + c;
        System.out.println(d); */

        //task 5
        /* System.out.println("Enter the value: ");
        Scanner variable = new Scanner(System.in);
        int a = variable.nextInt();
        int b = (a / 100) + (a % 10) + ((a / 10) % 10);
        System.out.println(b); */

        //task 6
        /* System.out.println("Enter the double value: ");
        Scanner variable = new Scanner(System.in);
        double a = variable.nextDouble();
         int b = (int) a;
        if ((a * 10) % 10 >= 5.0) {
            System.out.println(++b);
        }
        else if ((a * 10) % 10 < 5) {
            System.out.println(b--);
        }
        else {
            System.out.println(b);
        }*/

       /* if ((a * 10) % 10 >= 5.0) {
        System.out.println((++a) - (((a * 10) % 10) / 10));
        } else if ((a * 10) % 10 < 5) {
            System.out.println((a--) - (((a * 10) % 10) / 10));
        } */


        //task 7
        /* System.out.println("Enter the two variables: ");
        Scanner variable = new Scanner(System.in);
        int a = variable.nextInt();
        int b = variable.nextInt();
        int c = a % b;
        int d = a / b;
        System.out.println("Result of division: " + d + " Remainder of division: " + c); */

        //task 8
       /* System.out.println("Enter the two variables: ");
        Scanner variable = new Scanner(System.in);
        int a = variable.nextInt();
        int b = variable.nextInt();
        int c = a + b;
            a = c - a;
            b = c - b;
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b); */

        //task 8.1
       /* System.out.println("Enter the two variables: ");
        Scanner variable = new Scanner(System.in);
        int a = variable.nextInt();
        int b = variable.nextInt() + a;
        a = b - a;
        b = b - a;
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b); */
    }
}