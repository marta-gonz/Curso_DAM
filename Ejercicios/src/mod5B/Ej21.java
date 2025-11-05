/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5B;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej21------------------*/
/*Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza
los números desde A hasta B e indicar cuantos hay que sean pares*/
/**
 *
 * @author Marta González
 */
public class Ej21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a, b, cont;
        cont = 0;
        
        do {
        System.out.println("Introduce A: ");
        a = sc.nextInt();
        System.out.println("Introduce B: ");
        b = sc.nextInt();
        
            if (a>b) {
                System.out.println("A tiene que ser menos que B");
            }
        } while(a>b);
        
        while (a<=b) {
            
            System.out.println(a + " ");
            if (a%2==0) {
                cont += 1;
            } 
            
            a++;
        }
        System.out.println("En total hay: " + cont + " pares");
    } //main
} //class
