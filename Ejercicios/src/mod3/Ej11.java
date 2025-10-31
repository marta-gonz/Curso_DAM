/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod3;

import java.util.Scanner;

/**
 *
 * @author Marta González
 */
public class Ej11 {
    public static void main(String[] args) {

        int sumaPar, sumaImpar;
        sumaPar = 0;
        sumaImpar = 0;
        
        for (int i = 100; i <= 200; i++) {
            if (i%2==0) {
                sumaPar += i;
            } else {
                sumaImpar  += i;
            }
        }
        System.out.println("La suma de pares es: " + sumaPar);
        System.out.println("La suma de impares es: " + sumaImpar);
    }
}
