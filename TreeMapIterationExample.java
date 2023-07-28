/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */
import java.util.Map;
import java.util.TreeMap;

public class TreeMapIterationExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some elements to the TreeMap
        treeMap.put("John", 25);
        treeMap.put("Mary", 30);
        treeMap.put("Bob", 20);

        // Iterate over the TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}

