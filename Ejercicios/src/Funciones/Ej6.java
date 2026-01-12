/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA.*/
/**
 *
 * @author Marta González
 */
public class Ej6 {
    
    public static double precioIVA(double precio) {
        return precio*1.21;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, d, e;
        System.out.println("Introduce 5 precios: ");
        a = sc.nextInt();
        System.out.println("El precio con IVA es: " + precioIVA(a));
        b = sc.nextInt();
        System.out.println("El precio con IVA es: " + precioIVA(b));
        c = sc.nextInt();
        System.out.println("El precio con IVA es: " + precioIVA(c));
        d = sc.nextInt();
        System.out.println("El precio con IVA es: " + precioIVA(d));
        e = sc.nextInt();
        System.out.println("El precio con IVA es: " + precioIVA(e));
        
        
        
    } //main
} //class
