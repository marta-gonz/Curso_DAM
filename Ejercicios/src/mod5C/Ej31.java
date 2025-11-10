/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej31------------------*/
/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
separados por espacios. Muestra también el máximo, el mínimo y la media 
de esos números.
*/
/**
 *
 * @author Marta González
 */
public class Ej31 {
    public static void main(String[] args) {

        int max, min, media;
        for (int i=1; i <= 50; i++) {
            int num = (int)(Math.random()*200);
            System.out.print(num + " ");
        }
    } //main
} //class
