/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
usuario V, I además de N (nº de valores a crear).*/
/**
 *
 * @author Marta González
 */
public class Ej13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor, v, i, suma=0;
        
        System.out.println("Introduce  V: ");
        v = sc.nextInt();
        System.out.println("Introduce I: ");
        i = sc.nextInt();
        System.out.println("Introduce numero de valores a crear: ");
        valor = sc.nextInt();
        
        int[] num = new int[valor];
        num [0] = v;
        
        for (int j = 1; j < num.length; j++) {
            num[j] = num[j-1] + i;
            System.out.print(num[j]+" ");
        }
        
        System.out.println("");
      
        
        
    } //main
} //class
