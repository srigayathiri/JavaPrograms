/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */
import java.util.*;

public class InsertAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.print("Enter the position to insert the element: ");
        int pos = sc.nextInt();
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();
        list.add(pos - 1, element);
        System.out.println("Updated linked list: " + list);
    }
}

