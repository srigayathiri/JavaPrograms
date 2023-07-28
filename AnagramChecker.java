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

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word 1 ");
        String str1 = sc.nextLine();
        System.out.println("Enter the word 2");
        String str2 = sc.nextLine();
        boolean isAnagram = checkAnagram(str1, str2);
        if (isAnagram) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }
    
    public static boolean checkAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

