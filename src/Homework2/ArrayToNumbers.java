package Homework2;

import java.util.Arrays;

public class ArrayToNumbers {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
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
    }
}
