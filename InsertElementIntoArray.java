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

public class InsertElementIntoArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int elementToInsert = 6;
        int indexToInsert = 3;
        arr = insertElement(arr, elementToInsert, indexToInsert);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] insertElement(int[] arr, int elementToInsert, int indexToInsert) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == indexToInsert) {
                newArr[i] = elementToInsert;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
}
