/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.*;


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

        int[] vector = new int[55];
        int n=0;
        
        for (int i = 1; i < 10; i++) {
            Arrays.fill(vector, n, i+n, i);
            n+=i;
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        
        
    } //main
} //class
