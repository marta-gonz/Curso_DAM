/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo*/
/**
 *
 * @author Marta González
 */
public class Ej3 {
    
    public static int minimo(int a, int b) {
        
        if (a < b) {
            return a;
        } else 
            return b;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Introduce un numero: ");
        a = sc.nextInt();
        System.out.println("Introduce un numero: ");
        b = sc.nextInt();
        
        System.out.println("El menor es: " + minimo(a,b));
        
    } //main
} //class
