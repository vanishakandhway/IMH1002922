/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lowercase;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Lowercase {

    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        System.out.println("enter a string");
        String name =S.nextLine();
        System.out.println("IN lowercase  "+name.toLowerCase());
        System.out.println("string length"+name.length());
    }
}
