/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reverse;

/**
 *
 * @author vanis
 */
public class Reverse {
    private static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
private static void ReverseOrder(int number) {
        System.out.println("Sum in reverse order:");
        String sum = String.valueOf(number);
        for (int i = sum.length() - 1; i >= 0; i--) {
            System.out.print(sum.charAt(i));
        }
}
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 5,8,9};
        int b=sum(arr1);
        System.out.println("Sum of values in the array: " + b);
         ReverseOrder(b);
    }
}
