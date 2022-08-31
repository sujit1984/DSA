package main.Algorithms.sorting;

import java.util.Scanner;

public class ShellSort {

    public static int[] shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = Math.abs(n / 2); gap > 0; gap /= 2) //setting the gap value as (sizeof) array/2
        {
            for (int i = gap; i < n; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
        return arr;
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        int[] sortedArray = shellSort(intArray);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : sortedArray) {
            System.out.println(j);
        }
    }
}