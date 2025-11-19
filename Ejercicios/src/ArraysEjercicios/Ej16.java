/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Scanner;


/* -----------------T3-MOD-Ej16------------------*/
/*Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla. En esta ocasión has de utilizar Arrays.fill()*/
/**
 *
 * @author Marta González
 */
public class Ej16 {
    public static void main(String[] args) {

        int tam=0;
        
        for (int i = 0; i < 10; i++) {
            tam = tam +i;
        }
        
        int[] vector = new int[tam];
        vector[0] = 1;
        
        
    } //main
} //class
