/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod4;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej18------------------*/
/*Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números
naturales.*/
/**
 *
 * @author Marta González
 */
public class Ej18 {
    public static void main(String[] args) {

        double acumulador = 0;
        
        for (int i = 1; i < 6; i++) {
            acumulador = acumulador + Math.pow(i, 2);
        }
        
        System.out.println("La suma de los cuadrados es: " + acumulador);
    } //main
} //class
