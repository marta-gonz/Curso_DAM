/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej30------------------*/
/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
*/
/**
 *
 * @author Marta González
 */
public class Ej30 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            int num = (int)(Math.random()*11);
            System.out.print(num + " ");
        }
        System.out.println("");
    } //main
} //class
