package main.Algorithms.sorting;

public class StringSortingWithRadixCh2 {

    public static void radixStringSort(String[] strArray, int radix, int width){

        for(int i = width-1 ; i >= 0 ; i--){
            radixSingleSort(strArray,i,radix);
        }
    }

    public static void radixSingleSort(String[] strArray, int position , int radix){

        int numItems = strArray.length;
        int[] countArray = new int[radix];

        for(String value: strArray){
            countArray[getIndex(position,value)]++;
        }

        // adjust the count array
        for(int j = 1; j < radix ; j++){
            countArray[j] += countArray[j-1];
        }

        String[] temp = new String[numItems];

        for (int tempIndex = numItems - 1; tempIndex>=0 ; tempIndex-- ){
            temp[--countArray[getIndex(position, strArray[tempIndex])]] = strArray[tempIndex];
        }

        System.arraycopy(temp, 0, strArray, 0, numItems);
    }

    public static int getIndex(int position, String value){
        return value.charAt(position) - 'a';
    }



    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        // do radix sort

        radixStringSort(stringsArray,26, stringsArray[0].length());

        for (String s : stringsArray) {
            System.out.println(s);
        }
    }
}
