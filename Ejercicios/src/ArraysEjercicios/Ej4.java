/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Scanner;


/* -----------------T3-MOD-Ej4------------------*/
/*Crea un programa que pida veinte números enteros por teclado, los almacene en 
un array yluego muestre por separado la suma de todos los valores positivos y 
negativos.*/
/**
 *
 * @author Marta González
 */
public class Ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 20 numeros: ");
        int pos=0, neg=0;
        
        int[] num = new int[20];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] >=0 ) {
                pos += num[i];
            } else {
                neg += num[i];
            }
        }
        
        System.out.println("La suma de positivos es: " + pos);
        System.out.println("La suma de negativos es: " + neg);
    } //main
} //class
