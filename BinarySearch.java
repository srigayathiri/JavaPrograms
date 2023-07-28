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

public class BinarySearch {
    
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = input.nextInt();
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("The number is not found.");
        } else {
            System.out.println("The number is found at index " + result + ".");
        }
    }
}

