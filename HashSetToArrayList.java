/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */
import java.util.HashSet;
import java.util.ArrayList;

public class HashSetToArrayList {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // Convert HashSet to ArrayList
        ArrayList<String> arrayList = new ArrayList<String>(hashSet);

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}

