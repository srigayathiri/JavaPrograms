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

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int elementToRemove = 3;
        arr = removeElement(arr, elementToRemove);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] removeElement(int[] arr, int elementToRemove) {
        int indexToRemove = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            return arr;
        } else {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != indexToRemove) {
                    newArr[j++] = arr[i];
                }
            }
            return newArr;
        }
    }
}
