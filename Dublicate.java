/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dublicate;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Dublicate {

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
         int count=0;
         System.out.println("dublicate element is");
         for(int i=0;i<numberOfElement;i++){
             for(int j=i+1;j<numberOfElement;j++){
                 if(arr[i]==arr[j]){
                     count++;
                     System.out.println("dublicate element is "+arr[i]+"and frequency is"+count);
                     
                 }
             }
         }
         
         }
    }

