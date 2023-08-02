package week2;

import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of cases ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Input a number");
            int number = scanner.nextInt();
            System.out.println("Fib(" + number + ") = " + fib(number));
        }


    }

    public static int fib(int a){
        if( a <= 0 ) {
            return 0;
        }else if( a == 1 ) {
            return 1;
        }else {
            return ( fib( a - 1 )+ fib( a - 2 ));
        }
    }
}
