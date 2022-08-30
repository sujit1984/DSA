package main.Algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int firstUnsortedIndex = 1 ; firstUnsortedIndex < n; firstUnsortedIndex++ ) //since the first element is
            // expected to be sorted, we start the firstUnsortedIndex at the index 1
             {
                 int newElement = arr[firstUnsortedIndex];
                 int i;
                 for (i=firstUnsortedIndex;i > 0 && arr[i-1] > newElement; i--){
                     arr[i] = arr[i-1];
                 }
                 arr[i]= newElement;
        }
        return arr;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        int[] sortedArray = insertionSort(intArray);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : sortedArray) {
            System.out.println(j);
        }
    }
}