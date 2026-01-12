/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
su perímetro*/
/**
 *
 * @author Marta González
 */
public class Ej7 {
    
    public static double perimetro(double ancho, double alto) {
        return 2*(ancho+alto);
    }
    
    public static double area(double ancho, double alto) {
        return alto*ancho;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double ancho, alto;
        System.out.println("Introduce el ancho: ");
        alto = sc.nextDouble();
        System.out.println("Introduce el alto: ");
        ancho = sc.nextDouble();
        
        System.out.println("El perimetro del rectangulo es: " + perimetro(ancho, alto));
        System.out.println("El area del rectangulo es: " + area(ancho, alto));
        
        
    } //main
} //class
