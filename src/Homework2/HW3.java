package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        //task1
        /*System.out.println("Enter the size of array: ");
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
        System.out.println(Arrays.toString(arr));*/

        //task2
       /* System.out.println("Enter the size of array: ");
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
            System.out.print(arr[i] + " ");*/

        //task3
        /*System.out.println("Enter the size of array: ");
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
        }*/

        //task4
        /*System.out.println("Enter the size of array: ");
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
                a = arr[i];
            }
        }
        System.out.println("Max: " + a);
        int b = a;
        for (int i = 0; i < arr.length; i++) {
            if (b > arr[i]) {
                b = arr[i];
            }
        }
        System.out.println("Min: " + b);*/

        //task5
        /*System.out.println("Enter the size of array: ");
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
        System.out.println("Min Idx: " + b);*/

        //task6
        /*System.out.println("Enter the size of array: ");
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
        }*/

        //task7
        /*int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrPlus(arr)));
        int[] arr2 = new int[]{9, 9, 9};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arrPlus(arr2)));
    }

    public static int[] arrPlus(int[] array) {
        array[array.length - 1] += 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 10) {
                array[i] = 0;
                array[i - 1] += 1;
                if (array[0] == 9) {
                    int[] arr2 = new int[array.length + 1];
                    arr2[0] = 1;
                    array = arr2;
                }
            }
        }
        return array;
    }*/
    }
}


