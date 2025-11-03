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
public class Ej5V2 {
    public static void main(String[] args) {

        int num,  factorial;
        int i = 2;
        
        Scanner sc = new Scanner(System.in);
        
        do {
        System.out.println("Escribe un numero");
        num = sc.nextInt();
        } while (num <0);
        
            
        
        factorial =1;
        
        if (num==0) {
            factorial=1;
        } else {
          while (i<=num) {
            factorial = factorial * i;
            i++;
        }  
        }
        
        
        
        System.out.println("El factorial de " + num + " es " + factorial);
    }
}
