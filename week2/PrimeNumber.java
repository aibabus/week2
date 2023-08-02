package week2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of cases ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Input an integer ");
            int number = scanner.nextInt();
            if(primeNumber(number)){
                System.out.println(number + " eh primo");
            }else{
                System.out.println(number + " nao eh primo");
            }
        }
    }
    public static boolean primeNumber(int number ) {
        if (number <= 1) {
            return false;
        }

        // Check if num is divisible by any integer from 2 up to the square root of num.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If num is divisible by i, it is nxot prime.
            }
        }

        return true;
    }

}
