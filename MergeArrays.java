/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */
public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        
        int[] mergedArr = merge(arr1, arr2);
        
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }
    
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        int[] mergedArr = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }
        
        while (i < n1) {
            mergedArr[k++] = arr1[i++];
        }
        
        while (j < n2) {
            mergedArr[k++] = arr2[j++];
        }
        
        return mergedArr;
    }
}

