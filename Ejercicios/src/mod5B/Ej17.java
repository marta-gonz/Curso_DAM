/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5B;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último
dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.*/
/**
 *
 * @author Marta González
 */
public class Ej17 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int i, num, fallado, anterior, mayor100, total; 
        
        total = 0;
        fallado = 0;
        anterior = Integer.MIN_VALUE;
        mayor100 = 0;
        do {
            System.out.println("Introduce un numero");
            num  = sc.nextInt();
            total++;
            
            if (num<=anterior&&num!=0) {
                System.out.println("Has fallado");
                fallado++;
            }
            if(num>=100) {
                mayor100++;
            }
            
            anterior = num;
           
            } while(num!=0);
           
    } //main
} //class
