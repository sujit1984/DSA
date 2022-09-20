package main.Algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortUsingArrayMethod {
    /*
        # Author - Sujit S
        # Date - 20 Sept 2022
        # The Arrays collection provides us certain sort methods to automatically sort the given algorithm. Below
        code discusses a couple of such methods
     */


    public static void main(String[] args) throws InterruptedException {


        //int arr[8] = ;
        Scanner sc=new Scanner(System.in);

        int[] intArray = new int[10];

        for(int i=0; i<intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }

        //The below sort uses by default the DualPivotQuicksort, which is faster than the traditional Quick Sort
        // implementation using a single pivot
        Arrays.sort(intArray);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : intArray) {
            System.out.println(j);
        }

        // parallelSort method

        Scanner sc1=new Scanner(System.in);

        int[] intArray1 = new int[10];

        for(int i=0; i<intArray1.length; i++) {
            intArray1[i] = sc.nextInt();
        }

        Arrays.parallelSort(intArray1);


        for (int k : intArray1) {
            System.out.println(k);
        }

    }
}
