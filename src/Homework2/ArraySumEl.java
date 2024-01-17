package Homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySumEl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(0, 10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int sumVar = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] += sumVar;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        for (int arraysIn[]: arr){
            for (int data : arraysIn){
                sum += data;
            }
        }
        System.out.println(sum);
    }
}
