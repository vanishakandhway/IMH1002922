/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenodd;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Evenodd {

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
         int []evenarray=new int[sizeOfArray];
         int []oddarray=new int[sizeOfArray];
         int ecount=0;
         int ocount=0;
         for(int i=0;i<numberOfElement;i++){
             if(arr[i]%2==0){
                 
                 evenarray[ecount++]=arr[i];
             }
             else{
                 oddarray[ocount++]=arr[i];
             }
         }
         System.out.println("Elements in evenarray are:  ");
         for(int i=0;i<ecount;i++){
             System.out.println(evenarray[i]);
         }
         System.out.println("Elements in oddarray are:  ");
         for(int i=0;i<ocount;i++){
             System.out.println(oddarray[i]);
         }
    }
}
