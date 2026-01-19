/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package C1;

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
        System.out.println("Punto P1: x = " + p1.getX() + " y = " + p1.getY());
        System.out.println("Punto P2: x = " + p2.getX() + " y = " + p2.getY());
        System.out.println("Punto P3: x = " + p3.getX() + " y = " + p3.getY());
        
        //Modificar las coordenadas
        p1.setX(p1.getX() + 5);
        p1.setY(p1.getY() - 1);

        p2.setX(p2.getX() * 2);
        p2.setY(p2.getY() - 1);

        p3.setX(p3.getX() / 1);
        p3.setY(p3.getY() - 6);
        
        //Mostrar valores modificados
        System.out.println("\nVALORES MODIFICADOS");
        System.out.println("Punto P1: x = " + p1.getX() + " y = " + p1.getY());
        System.out.println("Punto P2: x = " + p2.getX() + " y = " + p2.getY());
        System.out.println("Punto P3: x = " + p3.getX() + " y = " + p3.getY());
    } //main
} //class
