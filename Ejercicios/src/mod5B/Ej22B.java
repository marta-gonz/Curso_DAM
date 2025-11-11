/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5B;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class Ej22B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
            //Blancos
            for (int j = 0; j<num-i; j++) {
                System.out.print(" ");
            }
            
            //Asteriscos
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
    } //main
} //class
