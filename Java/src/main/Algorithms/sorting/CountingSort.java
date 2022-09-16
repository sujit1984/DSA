package main.Algorithms.sorting;

import java.util.Scanner;

public class CountingSort {

        /*
        # Author - Sujit S
        # Date - 17 Sept 2022
        # This is a basic implementation of the Counting sort\
        # Time complexity = O(n),  Worst case complexity  = O(n), Space Complexity = O(n) - we have to create another
        # array for the counting purpose.
         */
    public static void countingSort(int[] arr, int min, int max){
        int[] countArray = new int[(max-min) +1 ];

        for (int k : arr) {
            countArray[k - min]++;
        }

        int j = 0 ;
        for(int i = min ; i <= max; i++)
            while(countArray[i-min]>0){
                arr[j++]=i;
                countArray[i-min]--;
            }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);

        int[] intArray = new int[10];

        for(int i=0; i<intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        countingSort(intArray, 0 , intArray.length);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : intArray) {
            System.out.println(j);
        }

    }
}
