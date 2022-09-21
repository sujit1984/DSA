package main.Algorithms.sorting;

import java.util.Scanner;

public class InsertionSortWithRecursion {

    public static void insertionSortWithRecursion(int[] arr, int numItems){
        if (numItems <2)
            return;   //condition to end the recursion

        insertionSortWithRecursion(arr, numItems -1);

        int newElement = arr[numItems-1];
        int i;
        for (i=numItems-1;i > 0 && arr[i-1] > newElement; i--){
                     arr[i] = arr[i-1];
                 }
         arr[i]  = newElement;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
       insertionSortWithRecursion(intArray,intArray.length);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : intArray) {
            System.out.println(j);
        }
    }
}