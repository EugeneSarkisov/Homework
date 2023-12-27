import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the int positive variable: ");
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
        }
    }
}

