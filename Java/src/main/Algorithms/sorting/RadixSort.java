package main.Algorithms.sorting;

import java.util.Scanner;

public class RadixSort {
        /*
        # Author - Sujit S
        # Date - 20 Sept 2022
        # This is a basic implementation of the Radix sort\
        # Time complexity = O(n^2) ,  Space Complexity = O(1)
     */
    public static void radixSort(int[] arr, int radix , int width){
        for(int i = 0 ; i < width; i++){
            radixSingleSort(arr,i,radix);
        }
    }

    public static void radixSingleSort(int[] arr, int position, int radix){

        int numItems = arr.length;

        int[] countArray = new int[radix];

        for(int value: arr){
            countArray[getDigit(position,value,radix)]++;
        }

        // adjust the count array
        for(int j = 1; j < radix ; j++){
            countArray[j] += countArray[j-1];
        }

        int[] temp = new int[numItems];

        for (int tempIndex = numItems - 1; tempIndex>=0 ; tempIndex-- ){
            temp[--countArray[getDigit(position, arr[tempIndex], radix)]] = arr[tempIndex];
        }

        for (int tempIndex = 0 ; tempIndex < numItems; tempIndex++){
            arr[tempIndex] = temp[tempIndex];

        }
    }

    public static int getDigit(int position, int value, int radix){
        return value/ (int) Math.pow(radix, position)%radix;
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);

        int[] intArray = new int[6];

        for(int i=0; i<intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        radixSort(intArray,10,4);

        Thread.sleep(3000);
        System.out.println("Printing the sorted array.....");

        for (int j : intArray) {
            System.out.println(j);
        }

    }
}
