/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5B;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej20------------------*/
/*Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla
los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su
valor. */
/**
 *
 * @author Marta González
 */
public class Ej20 {
    public static void main(String[] args) {

        
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero (1-20): ");
        num = sc.nextInt();
        
        for (int i=1; i <= num; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    } //main
} //class
