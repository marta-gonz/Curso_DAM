/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej31------------------*/
/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
separados por espacios. Muestra también el máximo, el mínimo y la media 
de esos números.
*/
/**
 *
 * @author Marta González
 */
public class Ej31 {
    public static void main(String[] args) {

        int max=100;
        int min=199;
        int suma=0;
        int num=0;
        int media;
        
        for (int i=0; i < 50; i++) {
            num = 100+(int)(Math.random()*100);
            
            suma +=num;
            
            if (num<min) {
                min=num;
            }
            
            if (num>max) {
                max=num;
            }
            
        }
        media = suma/50;
        System.out.println("El minimo es: " + min);
        System.out.println("El maximo es: "  + max);
        System.out.println("La media es: " + media);
    } //main
} //class
