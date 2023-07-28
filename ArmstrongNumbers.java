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
public class ArmstrongNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count = 0, digit, sum;
        for (int i = 1; i <= 1000; i++) {
            num = i;
            sum = 0;
            while (num > 0) {
                digit = num % 10;
                sum += Math.pow(digit, 3);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i + " is an Armstrong number.");
                count++;
            }
            if (count == 3) {
                break;
            }
        }
    }
}
