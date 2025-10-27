/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod2;

import java.util.Scanner;

/**
 *
 * @author Marta González
 */
public class Ej22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero es par");
        }
        
        if (num%5==0) {
            System.out.println("El numero es divisible entre 5");
        }

    }
}
