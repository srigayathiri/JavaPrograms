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
public class OnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = sc.nextLine();
        String digits = "";

        // iterate through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // check if the character is a digit
            if (Character.isDigit(c)) {
                digits += c;
            }
        }
        
        // print the digits found in the string
        System.out.println("Digits in the string: " + digits);
    }
}

