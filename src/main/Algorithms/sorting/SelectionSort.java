package main.Algorithms.sorting;

import java.util.Scanner;

public class SelectionSort {
    /*
        # Author - Sujit S
        # Date - 29 Aug 2022
        # This is a basic implementation of the selection sort\
        # Time complexity = O(n^2) , Space Complexity = O(1)
     */

    public static void swap(int[] arr, int i , int j ) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public static int[] selectionSort(int[] arr) {

        int lastUnsortedIndex;
        for (lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int j = 1; j <= lastUnsortedIndex; j++) {
                if (arr[j] > arr[largest]) {
                    largest = j;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
        }
        return arr;
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);

        int[] intArray = new int[10];

        for(int i=0; i<intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        int[] sortedArray = selectionSort(intArray);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : sortedArray) {
            System.out.println(j);
        }

    }
}
