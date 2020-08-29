package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the number of digit. The program will show Fizz for divisible by 3, Buzz for divisible by Odd, and FizBuzz for Both");
        int limit = scanner.nextInt();

        for (int i = 0; i <= limit; i++) {
            if (limit % 3 == 0) {
                System.out.println("Fizz");
            } else if (limit % 5 == 0) {
                System.out.println("Buzz");
            } else if (limit % 3 == 0 && limit % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(limit);
            }
        }

    }
}
