/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no*/
/**
 *
 * @author Marta González
 */
public class Ej2 {
    
    public static boolean esMayorEdad(int a) {
     
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        int a;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        a = sc.nextInt();
        
        if (esMayorEdad(a) == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    } //main
} //class
