/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        int sum = 0;
        
        // extract each digit and add to the sum
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        // print the result
        System.out.println("Sum of digits = " + sum);
    }
}
