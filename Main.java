package com.company.lesson4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] userNumbers = new int[3];
        System.out.println("Enter three numbers: ");
        Scanner numb = new Scanner(System.in);

        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = numb.nextInt();

        }
        System.out.println(userNumbers[0] + userNumbers[1] + userNumbers[2] + " - This is the summ of all elements!" );
    }
}
