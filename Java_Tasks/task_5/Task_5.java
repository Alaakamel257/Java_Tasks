/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task_5;

import java.util.Scanner;


public class Task_5 {

    public static void main(String[] args) {
      Scanner input =new Scanner(System.in); 
      System.out.print("enter the text  ");
      String txt = input.next(); 
       
        txt= txt.replace(",",""); 
       
        System.out.print(" the text after removing "+ txt); 
    }
}
