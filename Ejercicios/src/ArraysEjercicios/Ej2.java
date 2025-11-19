/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Locale;
import java.util.Scanner;


/* -----------------T3-MOD-Ej2------------------*/
/*Crea un programa que pida diez números reales por teclado, los almacene en 
un array, y luego muestre la suma de todos los valores.*/
/**
 *
 * @author Marta González
 */
public class Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double suma=0;
        
        System.out.println("Introduce 10 numeros: ");
        double[] numeros = new double[10];
        sc.useLocale(Locale.US);
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; 
        }
        System.out.println("La suma es: " + suma);   
    } //main
} //class
