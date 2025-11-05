/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5A;

import java.util.Scanner;

/**
 *
 * @author Marta González
 */
public class Ej5 {
    public static void main(String[] args) {

        int num1, num2, factorial;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero");
        num1 = sc.nextInt();
        
        num2 = num1;
        factorial =1;
        
        while (num2>1) {
            factorial = factorial * num2;
            num2 = num2 - 1;
        }
        
        System.out.println("El factorial de " + num1 + " es " + factorial);
        
    }
}
