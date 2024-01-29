/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.type;

/**
 *
 * @author vanis
 */
public class Type {

     private void display(int x) {
        System.out.println("Displaying integer: " + x);
     }
     private void display(float y) {
        System.out.println("Displaying float: " + y);
    }
     
    public static void main(String[] args) {
        Type c=new Type();
        c.display(5);
        c.display(3.5f);
        c.display('A');
        double dValue = 123.456;
        float fValue = (float) dValue; // Explicit type demotion with casting
        System.out.println("Demoted float value: " + fValue);
    }
}
