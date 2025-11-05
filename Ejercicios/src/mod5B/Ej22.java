/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5B;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej22------------------*/
/*Realiza un programa que pida un número y construya por pantalla su pirámide*/
/**
 *
 * @author Marta González
 */
public class Ej22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num, blancos, asteriscos = 0;
        
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        
        blancos = num-1;
        
        for (int i = 1; i <= num; i++) {
            
            //Blancos
            for (int j = 0; j <= blancos; j++) {
                System.out.print(" ");
            }
            
            //Asteriscos
            for (int k = 0; k <= asteriscos; k++) {
                System.out.print("*");
            }
            
            System.out.println("");
            
            blancos--;
            asteriscos+=2;
            
        }
    } //main
} //class
