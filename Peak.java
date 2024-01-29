/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peak;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Peak {

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
         System.out.println("peak element is:");
         if(numberOfElement==1){
             System.out.println(arr[0] );
         }
         if(arr[0]>arr[1]){
             System.out.println(arr[0] );
         }
         
         for(int i=1;i<numberOfElement;i++){
             if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]){
                 System.out.println(arr[i] );
             }
         }
          if(arr[numberOfElement-1]>arr[numberOfElement-2]){
             System.out.println(arr[numberOfElement-1] );
         }
    }
}
