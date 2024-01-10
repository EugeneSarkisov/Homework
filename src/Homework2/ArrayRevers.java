package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRevers {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        scanner.close();
        System.out.println(Arrays.toString(arr));
        int a = arr.length - 1;
        int b;
        for (int i = 0; i < arr.length / 2; i++){
            b = arr[i];
            arr[i] = arr[a];
            arr[a] = b;
            a--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
