/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero*/
/**
 *
 * @author Marta González
 */
public class Ej4 {
    
    public static int dimeSigno(int a) {
        if (a > 0) {
            return 1;
        } else if(a == 0) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.println("Introduce un numero: ");
        a = sc.nextInt();
        
        System.out.println(dimeSigno(a));
    } //main
} //class
