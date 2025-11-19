/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Scanner;


/* -----------------T3-MOD-Ej14------------------*/
/*Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla.*/
/**
 *
 * @author Marta González
 */
public class Ej14 {
    public static void main(String[] args) {

        int tam=0, valor=2, cuenta=2;
        
        int[] num = new int[54];
        
        for (int i = 0; i < 10; i++) {
            tam = tam +i;
        }
        
        int[] vector = new int[tam];
        vector[0] = 1;
        
        for (int i = 1; i < vector.length; i++) {
            vector[i]=valor;
            if (cuenta>1) {
                cuenta--;
            } else {
                valor++;
                cuenta=valor;
            }
            System.out.println(vector[i]+" ");
        }
        
        System.out.println("");
    } //main
} //class
