package main.Algorithms.recursion;
import java.util.Scanner;

public class Fibonacci {
    /*
        # Author - Sujit S
        # Date - 31 Aug 2022
        # This is a basic implementation of recursive approach to caldulate the fibonacci series numbers upto n
        # fibo(1) = 0
        # fibo(2) = 1
        # fibo(3) = fibo(2) + fib(1) = 1
        # fibo(4) = fibo(3) + fibo(2) = 1 + 1
        # 3! = 2! * 3 ...
     */
    public static int fib(int n){
        if (n<=1)
            return n;

        //Recursion
        return fib(n-1) + fib(n-2);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of fibonacci numbers to be printed  ");

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            System.out.print(fib(i)+"  ");
        }
    }

}


