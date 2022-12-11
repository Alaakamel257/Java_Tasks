/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task_7;


public class Task_7 {

    public static void main(String[] args) {
        int a[] = { 10, 30, 8, 4, 15, 25 };
        int n = a.length;
        System.out.println("array elements before sorting  are ");
        Quicksorting q1 = new Quicksorting();
        q1.printArr(a, n);
        q1.swap(a, 0, n - 1);
        System.out.println();
        System.out.println("array elements after sorting  are ");
        q1.printArr(a, n);
        System.out.println();
    }
}
