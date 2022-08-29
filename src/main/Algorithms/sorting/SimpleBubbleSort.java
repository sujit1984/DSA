package main.Algorithms.sorting;

import java.util.Scanner;

public class SimpleBubbleSort {
    /*
        # Author - Sujit S
        # Date - 29 Aug 2022
        # This is a basic implementation of the bubble sort
     */

    public static int[] BubbleSort(int[] arr){
            int n = arr.length;
            for (int i = 0 ; i < n; i++){
                for(int j=1; j < (n-i); j++ )
                    if (arr[j-1] > arr[j]){
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
            }
        return arr;
    }
    public static void main(String[] args) throws InterruptedException {


        //int arr[8] = ;
        Scanner sc=new Scanner(System.in);

        int[] intArray = new int[10];

        for(int i=0; i<intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
            int[] sortedArray = BubbleSort(intArray);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : sortedArray) {
            System.out.println(j);
        }
    }
}
