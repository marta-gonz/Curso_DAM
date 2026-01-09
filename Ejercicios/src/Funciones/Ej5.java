/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros*/
/**
 *
 * @author Marta González
 */
public class Ej5 {
    public static double millasKilometros(int millas) {
        return millas*1.60934;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int millas;
        
        System.out.println("Introduce numero de millas: ");
        millas = sc.nextInt();
        
        System.out.println("El equivalente en kilometros es: "  + millasKilometros(millas));
        
    } //main
} //class
