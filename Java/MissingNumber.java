//You are given all numbers between 1,2,...,n except one. Your task is to find the missing number.

import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given all numbers between 1,2,...,n except one. Your task is to find the missing number.");
        System.out.print("Total number is: ");

        int n = sc.nextInt();

        long sum_all_num = (long) n * (n+1) / 2;

        long sum_given_num = 0;

        System.out.println("Give the rest " + (n - 1) + " numbers");

        for (int i = 0; i < n - 1; i++) {
            sum_given_num += sc.nextInt();
        }

        long missing_num = sum_all_num - sum_given_num;

        System.out.println("The missing number is " + missing_num);
        sc.close();
    }
}
