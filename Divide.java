/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divide;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Divide {

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
         System.out.println("enter the speciied position from where you want to divide an array");
         int pos;
         pos=S.nextInt();
         int []arr1=new int[sizeOfArray];
         int []arr2=new int[sizeOfArray];
         int count1=0;
         int count2=0;
        
             for(int k=0;k<pos;k++){
                 arr1[count1++]=arr[k];
             }
             for(int j=pos;j<numberOfElement;j++){
                 arr2[count2++]=arr[j];
             }
             System.out.println("Elements in array1 are:  ");
         for(int i=0;i<count1;i++){
             System.out.println(arr1[i]);
         }
         System.out.println("Elements in array2 are:  ");
         for(int i=0;i<count2;i++){
             System.out.println(arr2[i]);
         }
         
             
         System.out.println("Elements dublicate in array1 are:  ");
         for(int i=0;i<count1;i++){
             for(int j=i+1;j<count1;j++){
                 if(arr1[i]==arr1[j]){
                     System.out.println("dublicate element is "+arr1[i]);
                 }
             }
            
         }
         System.out.println("Elements dublicate in array2 are:  ");
         for(int i=0;i<count2;i++){
             for(int j=i+1;j<count2;j++){
                 if(arr2[i]==arr2[j]){
                     System.out.println("dublicate element is "+arr2[j]);
                 }
             }
            
         }
    }
}
