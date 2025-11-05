/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5B;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej19------------------*/
/* Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces
igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá
escribir un único asterisco.*/
/**
 *
 * @author Marta González
 */
public class Ej19 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        
        if (num<0) {
            System.out.println("*");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    } //main
} //class
