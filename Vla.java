/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vla;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Vla {
    public static void totalargument(int...number){
        System.out.println("total number of argument is "+number.length);
    }
    public static int max(int...number){
        int max =number[0];
        for(int num:number){
            if(num>max){
                max=num;
            }
        }
return max;
        }
        
    public static int sum(int...number){
        int sum =0;
        for(int num :number){
            sum+=num;
            
    }
         return sum;
    }
    public static void mixarg(Object... args) {
        System.out.println("Mixed arguments:");

        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        totalargument(2,3,5);
        int b=max(3,5,6,7);
        System.out.println("Maximum number in the list: " + b);
        int c=sum(4,5,7);
        System.out.println("sum is : " + c);
        mixarg(8.9,2);
    }
}
