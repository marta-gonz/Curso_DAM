/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod4;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej16------------------*/
/*Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no. */
/**
 *
 * @author Marta González
 */
public class Ej16 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        int num;
        boolean primo = true;
        
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        
        if (num==0) primo = false;
        
        for (int i = 2; i<=num-1&&primo; i++) {
            if (num%i==0) {
                primo=false;
            }
        }
            if (primo) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        
        
    } //main
} //class
