/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task_6;


public class Triangle {
    private double h,X,Y,Z; 
        
        public void set_t (double high, double l1,double l2,double l3) 
        { h=high;  
          X=l1; 
          Y=l2; 
          Z=l3; 
        }  
         
        public double Area ( ) 
        { return (0.5*Y*h); } 
         
         public double Circumference () 
         { return (X+Y+Z) ;  } 
          
    
}
