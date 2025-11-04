/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod4;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej15------------------*/
/*Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
introducimos por teclado. */
/**
 *
 * @author Marta González
 */
public class Ej15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num,  cont;
        
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        cont = 0;
        
        for (int i = 1; i <= num; i++) {
            if (i%3==0) 
                cont += 1;
                        
        }
            
        System.out.println("Hay " + cont + " multiplos de 3");
    } //main
} //class
