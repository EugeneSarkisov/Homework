import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        System.out.println("Enter the variable: ");

        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        scanner.close();

        if (temperature > -5){
            System.out.println("Warm");
        } else if (temperature <= -5 && temperature > -20){
            System.out.println("Normal");
        } else if (temperature >= -20){
            System.out.println("Cold");
        }

    }
}

