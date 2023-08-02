package week2;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of cases ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Input an integer ");
            int number = scanner.nextInt();
            if(perfNumber(number)){
                System.out.println(number + " eh perfeito");
            }else{
                System.out.println(number + " nao eh perfeito");
            }
        }

    }
    public static boolean perfNumber(int number ){
        if (number <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }


}

