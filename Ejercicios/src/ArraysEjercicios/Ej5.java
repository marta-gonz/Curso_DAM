/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.*;


/* -----------------T3-MOD-Ej5------------------*/
/*Crea un programa que pida veinte números reales por teclado, los almacene en 
un array y luego lo recorra para calcular y mostrar la media: (suma de valores) 
/ nº de valores. */
/**
 *
 * @author Marta González
 */
public class Ej5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double[] num = new double[20];
        double suma=0;
        
        System.out.println("Introduce 20 numeros: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextDouble();
        }
        
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        
        System.out.println("La media es: " + suma/num.length);
        
    } //main
} //class
