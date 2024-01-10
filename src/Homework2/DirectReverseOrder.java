package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class DirectReverseOrder {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        scanner.close();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
