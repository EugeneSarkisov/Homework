package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxIdx {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array: ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(arr));
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                a = i;
            }
        }
        System.out.println("Max Idx: " + a);
        int b = a;
        for (int i = 0; i < arr.length; i++) {
            if (b > arr[i]) {
                b = i;
            }
        }
        System.out.println("Min Idx: " + b);
    }
}
