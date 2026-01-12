/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysA;

import java.util.*;

/**
 *
 * @author Marta
 */

/*Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
primer array al segundo array en orden inverso, y mostrar ambos por pantalla.*/

public class Ej11 {
    public static void main(String[] args) {

        int vec1[] = new int[100];
        int vec2[] = new int[100];
        
        for (int i = 0; i < vec2.length; i++) {
            vec1[i] = i+1; 
            System.out.print(vec1[i] + " ");
        }
        System.out.println("");
        
        for (int i = 0; i < vec2.length; i++) {
            vec2[i] = vec1[vec1.length-i-1];
            System.out.print(vec2[i] + " ");
        }
    }
}

