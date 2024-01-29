/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deletion;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Deletion {

    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
         int sizeOfArray=S.nextInt();
         
         int [] arr=new int[sizeOfArray];
         System.out.println("Enter the number of elements of the array:");
         int numberOfElement=S.nextInt();
         System.out.println("Elements are: ");
         for(int i=0;i<numberOfElement;i++){
             arr[i]=S.nextInt();
         }
          System.out.println("Elements in array are:  ");
         for(int i=0;i<numberOfElement;i++){
             System.out.println(arr[i]);
         }
         System.out.println("Enter the location where you want to delete a element");
         int loc =S.nextInt();
         for(int i=loc-1;i<numberOfElement;i++){
             arr[i]=arr[i+1];
         }
         numberOfElement--;
         System.out.println("Elements after deletion ");
         for(int i=0;i<numberOfElement;i++){
             System.out.println(arr[i]);
         }
    }
}
