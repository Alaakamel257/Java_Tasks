/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task_1;

import java.util.Scanner;


public class Task_1 {

    public static void main(String[] args) {
        //take input from user in ascii
Scanner input = new Scanner(System.in);
System.out.println("enter the ASCII value");
int ASCII = input.nextInt();
// the charchter is
char output = (char) ASCII ;
System.out.println(output);

    }
}
