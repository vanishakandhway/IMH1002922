/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operation;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Operation {

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
         //insertion operation
          System.out.println("enter the position where you want to insert");
          int pos=S.nextInt();
           System.out.println("enter the element you want to insert");
          int ele=S.nextInt();
          for(int i=numberOfElement-1;i>=pos-1;i--){
              arr[i+1]=arr[i];
              
          }
          arr[pos-1]=ele;
          numberOfElement++;
          
          System.out.println("elements in array after insertion  ");
         for(int i=0;i<numberOfElement;i++){
             System.out.println(arr[i]);
         }
    }
}
