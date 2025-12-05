/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysB;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
de la cadena en una línea distinta.*/
/**
 *
 * @author Marta González
 */
public class Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introuce un texto:  ");
        String texto = sc.nextLine();
        
        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        
    } //main
} //class
