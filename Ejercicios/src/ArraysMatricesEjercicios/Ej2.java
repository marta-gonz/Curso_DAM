/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysMatricesEjercicios;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla*/
/**
 *
 * @author Marta González
 */
public class Ej2 {
    public static void main(String[] args) {

       
        int matriz[][] = new int[11][11];
        
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                matriz[i][j] = i*j;
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        
    } //main
} //class
