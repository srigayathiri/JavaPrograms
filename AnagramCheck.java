/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        if (isAnagram(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are anagrams.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not anagrams.");
        }
    }

    public static boolean isAnagram(int num1, int num2) {
        char[] arr1 = Integer.toString(num1).toCharArray();
        char[] arr2 = Integer.toString(num2).toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

