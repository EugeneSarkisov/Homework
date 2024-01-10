package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroCount {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        scanner.close();
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int var : arr){
            if (var == 0){
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("No zero elements.");
        } else {
            System.out.println("Count of zero elements: " + counter);
        }
    }
}
