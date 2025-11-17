/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Scanner;


/* -----------------T3-MOD-Ej1------------------*/
/*Crea un programa que pida diez números reales por teclado, los almacene en 
un array, y luego muestre todos sus valores*/
/**
 *
 * @author Marta González
 */
public class EJ1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 10 numeros: ");
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);    
        }
        
    }
}