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
public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        
        String sentence = sc.nextLine();
        
        System.out.println("Enter a word");
        
        String word = sc.nextLine();
        
        int count = countOccurrences(sentence, word);
        System.out.println("The word \"" + word + "\" appears " + count + " times in the sentence:\n" + sentence);
    }

    public static int countOccurrences(String sentence, String word) {
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = sentence.indexOf(word, index);
            if (index != -1) {
                count++;
                index += word.length();
            }
        }
        return count;
    }
}
