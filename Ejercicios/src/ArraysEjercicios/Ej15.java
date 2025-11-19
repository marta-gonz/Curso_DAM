/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Arrays;
import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N
que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
*/
/**
 *
 * @author Marta González
 */
public class Ej15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n, m;
        System.out.println("Introduce n: ");
        n = sc.nextInt();
        System.out.println("Introduce m: ");
        m = sc.nextInt();
        
        int[] vector = new int[n];
        Arrays.fill(vector, m);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
            
        }
    } //main
} //class
