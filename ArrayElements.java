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

public class ArrayElements {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 9, 1, 3, 4 };
        
        int thirdLargest = findThirdLargest(arr);
        int secondSmallest = findSecondSmallest(arr);
        
        System.out.println("Third Largest Element: " + thirdLargest);
        System.out.println("Second Smallest Element: " + secondSmallest);
    }
    
    public static int findThirdLargest(int[] arr) {
        int n = arr.length;
        
        if (n < 3) {
            return -1; // Array must have at least 3 elements
        }
        
        Arrays.sort(arr);
        
        return arr[n - 3];
    }
    
    public static int findSecondSmallest(int[] arr) {
        int n = arr.length;
        
        if (n < 2) {
            return -1; // Array must have at least 2 elements
        }
        
        Arrays.sort(arr);
        
        return arr[1];
    }
}

