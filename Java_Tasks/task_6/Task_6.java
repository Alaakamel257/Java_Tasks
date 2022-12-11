/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task_6;


public class Task_6 {

    public static void main(String[] args) {
       Triangle triangle = new Triangle(); 
         
        triangle.set_t(5, 5, 3, 6); 
         System.out.println( "area is " + triangle.Area()); 
         System.out.println( "circcumference is " + triangle.Circumference() ) ; 
         
        Circle circle = new Circle(); 
         
        circle.set_circle(5); 
       System.out.println( "area is " + circle.Area() ); 
       System.out.println( "circcumference is " + circle.Circumference()); 
    }
}
