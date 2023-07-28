/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKey {
    public static void main(String[] args) {
        // Create a HashMap with some elements
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(3, "apple");
        hashMap.put(2, "banana");
        hashMap.put(1, "orange");

        // Sort the HashMap by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<Integer, String>(hashMap);

        // Print the sorted map
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

