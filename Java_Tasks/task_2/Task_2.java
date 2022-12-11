/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task_2;

import java.util.Scanner;


public class Task_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                 //the first number from user 
                System.out.println("enter first number n ");
                 int n = input.nextInt();
                  //the second number from user 
                System.out.println("enter second number r ");
                 int r = input .nextInt();
                 
                 int i =1 , fact=1,num , denom , sub;
                 // to find n!
                 while(i<=n){
                     fact= fact * i ;
                     i++;
                 }
                 num= fact;
                 sub= n-r;
                 fact=1;
                 i=1;
                 // to find n-1!
                 while(i<=sub)
                 { fact= fact * i ;
                     i++;
                 }
                 denom = fact;
                 fact=1;
                 i=1;
                 while(i<=r){
                 fact= fact * i ;
                     i++;
                 }
                 denom =(fact*denom);
                 // to find ncr
                 int ncr ;
                 ncr = num / denom ;
                 // to find npr
                 int npr = num/n;
                 System.out.println("/ npr = " + npr );
                 
                 System.out.println("/ ncr = " + ncr );

                     
                     
                 }
                     
        
    }

