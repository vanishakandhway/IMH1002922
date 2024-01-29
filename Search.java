/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.search;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Search {

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
         System.out.println("Enter the element you want to search : ");
         int element=S.nextInt();
         int count =0;
         for(int i=0;i<numberOfElement;i++){
             if(arr[i]==element){
                 count++;
             }
         }
             if(count==1){
                 System.out.println("element found in an array");
             }
             else{
                 System.out.println("not found");
             }
             
         }
    }

