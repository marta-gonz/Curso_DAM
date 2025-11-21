/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysMatricesEjercicios;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.*/
/**
 *
 * @author Marta González
 */
public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int filas, columnas;
        int mayor, menor, cero;
        
        do {
        System.out.println("Introduce filas: ");
        filas = sc.nextInt();
        System.out.println("Introduce columnas: ");
        columnas = sc.nextInt();
        } while(filas <=1 && columnas<=1);
        
        int matriz [][] = new int [filas][columnas];
        
        
    } //main
} //class
