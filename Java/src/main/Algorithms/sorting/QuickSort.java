package main.Algorithms.sorting;

import java.util.Scanner;

public class QuickSort {
        /*
        # Author - Sujit S
        # Date - 15 Sept 2022
        # This is a basic implementation of the Quick sort\
        # Time complexity = O(nlogn),  Worst case complexity  = O(n2), Space Complexity = O(1)
     */

    public static void quickSort(int[] arr, int start, int end ){
        if (end-start < 2 ){
            return;
        }

        int pivotIndex =  partition(arr,start,end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1 , end);

    }

    public static int partition(int[]arr, int start, int end){

        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j){

            while (i <  j  && arr[--j] >= pivot); //empty loop body
            if (i<j){
                arr[i] = arr[j];
            }

            while(i < j && arr[++i] <= pivot);

            if(i<j){
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;

        return j;
    }


    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);

        int[] intArray = new int[10];

        for(int i=0; i<intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        quickSort(intArray, 0 , intArray.length);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : intArray) {
            System.out.println(j);
        }

    }
}
