/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysMatricesEjercicios;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla.*/
/**
 *
 * @author Marta González
 */
public class Ej1 {
    public static void main(String[] args) {

        int matriz[][] = new int[5][5];
        int suma = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]= suma;
                suma+=1;
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");               
            }
            System.out.println("");
        }//for externo
    } //main
} //class
