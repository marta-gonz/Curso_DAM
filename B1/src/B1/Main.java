/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package B1;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class Main {
    public static void main(String[] args) {
        
        //Instanciamos los objetos
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(-3,7);
        
        //Mostramos las coordenadas
        System.out.println("Punto P1: x = " + p1.x + " y = " + p1.y);
        System.out.println("Punto P2: x = " + p2.x + " y = " + p2.y);
        System.out.println("Punto P3: x = " + p3.x + " y = " + p3.y);
        
        //Modificar las coordenadas
        p1.x+=5;
        p1.y--;
        
        p2.x*=2;
        p2.y--;
        
        p3.x/=1;
        p3.y-=6;
        
        //Mostrar valores modificados
        System.out.println("\nVALORES MODIFICADOS");
        System.out.println("Punto P1: x = " + p1.x + " y = " + p1.y);
        System.out.println("Punto P2: x = " + p2.x + " y = " + p2.y);
        System.out.println("Punto P3: x = " + p3.x + " y = " + p3.y);
    } //main
} //class
