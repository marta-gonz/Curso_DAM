/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos*/
/**
 *
 * @author Marta González
 */
public class Ej1 {
    
    public static double multiplicar(double a, double b){
        return a*b;
    }
    
    public static void main(String[] args) {
        double a, b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        a = sc.nextDouble();
        System.out.println("Introduce un numero: ");
        b = sc.nextDouble();
        
        System.out.println(multiplicar(a,b));
    } //main

} //class
