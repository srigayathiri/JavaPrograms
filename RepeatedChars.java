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
public class RepeatedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        
        int count;
        char[] chars = str.toCharArray();

        System.out.println("Repeated characters in the string '" + str + "':");

        for (int i = 0; i < chars.length; i++) {
            count = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != ' ') {
                    count++;
                    chars[j] = '0';
                }
            }

            if (count > 1 && chars[i] != '0') {
                System.out.print(chars[i] + " ");
            }
        }
    }
}
