/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.*;

/**
 *
 * @author Marta
 */
/*Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
tres) y nos devuelva el máximo de los dos valores.
*/
public class Ej9 {
    
    public static int maximo(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int mayor;
        
        System.out.println("Introduce un numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce un numero: ");
        num2 = sc.nextInt();
        System.out.println("Introduce un numero: ");
        num3 = sc.nextInt();
        
        mayor = maximo(num1, num2);
        
        System.out.println("El mayor es: " + maximo(mayor, num3));
    }
}

