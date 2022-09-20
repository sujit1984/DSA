package main.Algorithms.sorting;

import java.util.Scanner;

public class MergeSortDescendingCh1 {
    /*
        # Author - Sujit S
        # Date - 20 Sept 2022
        # This is the descending sorting algorithm for the merge sort.
        # Time complexity = O(nlogn) , Space Complexity = O(1)
     */

    public static void mergeSortDesc(int[] arr, int start , int end){
        if (end - start < 2)    // this is the breaking condition for the recursive method
            return;
        // Now we are going to logically partition the array

        int mid = (start + end)/2;
        mergeSortDesc(arr, start, mid);
        mergeSortDesc(arr, mid , end);
        merge(arr , start, mid , end);
    }

    public static void merge( int[] arr, int start, int mid , int end){

        if(arr[mid-1] >= arr [mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0 ;

        int[] temp = new int[end - start];

        while (i < mid && j < end){
            temp[tempIndex++] = arr[i] >= arr[j] ? arr[i++] : arr[j++];

        }

        System.arraycopy(arr,i,arr,start+tempIndex, mid-i);

        System.arraycopy(temp,0,arr, start, tempIndex);
    }
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        mergeSortDesc(intArray,0, intArray.length);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : intArray) {
            System.out.println(j);
        }

    }

}
