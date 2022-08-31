package main.Algorithms.recursion;

import java.util.Scanner;

public class Factorial {
        /*
        # Author - Sujit S
        # Date - 31 Aug 2022
        # This is a basic implementation of recursive and iterative approach to caldulate the factorial of a number
        # 1! = 0! * 1
        # 2! = 1! * 2
        # 3! = 2! * 3 ...
     */

    public static int iterativeFactorial(int n){
        if (n == 0 )
            return 1;
        int fact = 1;
        int mult = 1 ;
        while(mult<=n){
            fact*=mult;
            mult++;
        }
        return fact;
    }

    public static int recursiveFactorial(int n) {
        if (n == 0)
            return 1;

        return n * recursiveFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want the factorial of :");
        int n = sc.nextInt();

        int result = iterativeFactorial(n);
        int recurFact = recursiveFactorial(n);
        System.out.println("The factorial of " + n + " is : " + result);
        System.out.println("The factorial of " +n + " using recursion : " +recurFact);

    }
}
