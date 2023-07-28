/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class RemoveFirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        if (str.length() <= 2) {
            System.out.println("Result: ");
        } else {
            String result = str.substring(1, str.length() - 1);
            System.out.println("Result: " + result);
        }
    }
}
