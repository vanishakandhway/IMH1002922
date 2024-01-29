/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area;

/**
 *
 * @author vanis
 */
//import java.util.*;
public class Area {

    static public void area(int x){
        int area=x*x;
        int per =4*x;
        System.out.println("area of square is :"+area+"and perimeter is "+per);
    }
    static public void area(int x, int y){
        int area=x*y;
        int per =2*(x+y);
        System.out.println("area of rectangle is :"+area+"and perimeter is "+per);
    }
    static public void area(double r){
        float  area=(float)(2*3.14*r);
        float cir =(float)(3.14*r*r);
        System.out.println("area of circle is :"+area+"and perimeter is "+cir);
    }
    
    public static void main(String[] args) {
        //Scanner S =new Scanner(System.in);
        area(4);
        area(5,6);
        area(2.3);
    }
}
