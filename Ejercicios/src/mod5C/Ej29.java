/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej29------------------*/
/*Escribe un programa que muestre la tirada de tres dados. 
Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
*/
/**
 *
 * @author Marta González
 */
public class Ej29 {
    public static void main(String[] args) {

        int tirada = 0, suma = 0;
        
        for (int i = 1; i <= 3; i++) {
            tirada = (int)(Math.random()*6)+1;
            suma+=tirada;
            System.out.println("Tirada " + i + " = "  + tirada);
        }
        
        System.out.println("Suma = " + suma);
    } //main
} //class
