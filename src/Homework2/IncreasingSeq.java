package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingSeq {
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
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] < arr[i + 1]){
                counter++;
            }
        }
        if (counter == arr.length - 1){
            System.out.println("Increasing");
        } else {
            System.out.println("Not increasing");
        }
    }
}
