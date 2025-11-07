/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej24------------------*/
/*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El
primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula
sumando los dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8,
13, 21, 34, 55, 89, 144… El número n se debe introducir por teclado.*/
/**
 *
 * @author Marta González
 */
public class Ej24 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce unn  numero");
        int n = sc.nextInt();
        int n1,n2,n3;
        n1 = 0;
        n2 = 1;
        n3 = 1;
        switch (n) {
            case 1: 
                System.out.println(n1);
            case 2:
                System.out.println(n1 + " " + n2);
            default:
                System.out.print(n1 + " " + n2);
                for (int i = 3; i<=n; i++) {
                    System.out.print(" " + n3);
                    
                    n1 = n2;
                    n2 = n3;
                    n3 = n1 + n2;
                }
        }
        System.out.println(" ");
    } //main
} //class
