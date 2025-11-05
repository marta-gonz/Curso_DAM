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
public class Ej9 {
    public static void main(String[] args) {

        int mul = 1, suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma = suma  + i;
            mul = mul * i;
        }
        
        System.out.println("La suma es: "  + suma);
        System.out.println("La multiplicación es:: " + mul);
        
    }
}
