/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */
import java.util.ArrayList;

public class TestArrayListEmpty {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements to the ArrayList
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // Check if ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
