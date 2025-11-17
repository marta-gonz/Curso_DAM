/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Scanner;


/* -----------------T3-MOD-Ej3------------------*/
/*Crea un programa que pida diez números reales por teclado, los almacene 
en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos 
por pantalla.*/
/**
 *
 * @author Marta González
 */
public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int max=0, min=0;
        
        System.out.println("Introduce 10 numeros: ");
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
            }
            
        }
        
        
        
    } //main
} //class
