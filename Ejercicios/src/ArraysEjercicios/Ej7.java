/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Scanner;


/* -----------------T3-MOD-Ej7------------------*/
/*Crea un programa que pida dos valores enteros P y Q, luego cree un array 
que contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
*/
/**
 *
 * @author Marta González
 */
public class Ej7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int p=0, q;
        System.out.println("Valor 1: ");
        p = sc.nextInt();
        System.out.println("Valor 2: ");
        q = sc.nextInt();
        
        int[] valores = new int[q-p+1];
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = p;
            p++;
        }
        
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println("");
    } //main
} //class
