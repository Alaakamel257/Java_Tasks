/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task_4;

import java.util.Scanner; 
public class Task_4 { 
 
    public static void main(String[] args) { 
         
        Scanner input =new Scanner(System.in); 
        // System.out.println("please enter number of row"); 
        int r = input.nextInt();
        // System.out.println("please enter number of colmn"); 
        int c =input.nextInt(); 
        
        int [][]arr=new int[r][c]; 
         
        for(int i=0; i<r;i++) 
        {    for(int j=0; j<c; j++ )  
            { arr[i][j]=input.nextInt(); } } 
             
        int [][]trans= new int[r][c]; 
         
        for(int i=0; i<r;i++) 
        {   for(int j=0; j<c; j++ )  
            { trans[j][i]=arr[i][j]; } } 
         
         
        for(int i=0; i<r;i++) 
        { 
            for(int j=0; j<c; j++ )  
            { System.out.print(trans[i][j]+"");  } 
            System.out.println(); 
        } 
             
         
    }   
    }
