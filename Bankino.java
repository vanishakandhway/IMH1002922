/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankino;

/**
 *
 * @author vanis
 */
import java.util.*;
public class Bankino {
    static boolean validateuser(String name){
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean validateuser(int age){
        
            return age > 3 && age < 15;
     }

    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        System.out.println("enter name ");
        String name1 =S.nextLine();
        System.out.println("enter age ");
        int age1=S.nextInt();
        validateuser( name1);
        validateuser(age1);
        if(validateuser( name1)){
        if(validateuser(age1)){
            System.out.println("user info is valid  ");
        }
        else{
                System.out.println("age is invalid ");
                }
        
    }
        else{
                System.out.println("name is invalid  ");
                }
    }
}
