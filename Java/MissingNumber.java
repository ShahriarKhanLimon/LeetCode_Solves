//You are given all numbers between 1,2,...,n except one. Your task is to find the missing number.

import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("You are given all numbers between 1,2,...,n except one. Your task is to find the missing number.");
        //System.out.print("Total number is: ");

        int n = sc.nextInt();

        // sc.nextLine();          // To consume the newline character left by nextInt()

        long sum_all_num = (long) n * (n+1) / 2;

        long sum_given_num = 0;


        // Read the given n-1 numbers from a single line
        //String[] numbers = sc.nextLine().split(" ");

        // Sum the given numbers
        // for (String number : numbers) {
        //     sum_given_num += Integer.parseInt(number);
        // }
        //System.out.println("Provide the rest " + (n-1) + " numbers:");

        for (int i = 0; i < n - 1; i++) {
            sum_given_num += sc.nextInt();
        }

        long missing_num = sum_all_num - sum_given_num;

        //System.out.println("The missing number is " + missing_num);
        System.out.println(missing_num);
        sc.close();
    }
}