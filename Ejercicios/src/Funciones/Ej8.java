/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N.*/
/**
 *
 * @author Marta González
 */
public class Ej8 {
    
    public static int sumatorio(int n) { 
        int suma=0;
        for (int i = 1; i <= n; i++) {
            suma+=i;  
        }
        return suma;
    }
    
    public static int productorio(int n) {
        int producto=1;
        for (int i = 1; i <= n; i++) {
            producto*=i;  
        }
        return producto;
    }
    
    public static double intermedio(int n) {
        return (1+n)/2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.println("Introduce un numero: ");
        n = sc.nextInt();

        System.out.println("El sumatorio es: " + sumatorio(n));
        System.out.println("El productorio es: " + productorio(n));
        System.out.println("El intermedio es: " + intermedio(n));
    
    } //main
} //class
