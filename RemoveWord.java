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

public class RemoveWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the word to remove: ");
        String wordToRemove = sc.nextLine();
        
        String[] words = str.split(" "); // split the string into an array of words
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            if (!word.equals(wordToRemove)) { // if the word is not the one to remove
                sb.append(word).append(" "); // append it to the result string with a space
            }
        }
        
        String result = sb.toString().trim(); // remove trailing space from result string
        System.out.println("Result: " + result);
    }
}

