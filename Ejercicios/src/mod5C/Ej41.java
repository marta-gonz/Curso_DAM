/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.*;


/* -----------------T2-MOD5-Ej41------------------*/
/*Escribe un programa que, dado un número introducido por teclado, elija al 
azar uno de sus dígitos.*/
/**
 *
 * @author Marta González
 */
public class Ej41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
              
        try {
            System.out.println("Introduce un numero: ");
            int num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido no valido");
        }
    } //main
} //class
