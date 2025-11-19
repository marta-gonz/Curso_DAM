/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Locale;
import java.util.Scanner;


/* -----------------T3-MOD-Ej8------------------*/
/*Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 
y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. 
Por último, mostrará cuántos valores del array son igual o superiores a R.*/
/**
 *
 * @author Marta González
 */
public class Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double[] num = new double[100];
        sc.useLocale(Locale.US);
        
        for (int i = 0; i < num.length; i++) {
            num[i] = Math.random();
        }
        
        System.out.println("Introduce un numero: ");
        double valor = sc.nextDouble();
        
        for (int i = 0; i < num.length; i++) {
            if (valor <= num[i]) {
                System.out.println(num[i] + " es  mayor");
            }
            
        }
    } //main
} //class
