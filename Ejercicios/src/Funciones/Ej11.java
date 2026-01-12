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
/*Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número.*/
public class Ej11 {
    public static void tabla(int num) {
        int resultado = 1;
        for (int i = 1; i <= 10; i++) {
            resultado = i * num;
            System.out.print(resultado + " ");
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();
       
        tabla(num);
        
    }
}

