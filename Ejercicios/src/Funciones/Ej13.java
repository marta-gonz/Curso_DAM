/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.*;

/**
 *
 * @author Marta
 */
/*Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento.*/
public class Ej13 {
    
    public static double descuento(double cantidadSin, double cantidadCon) {
        double descuento;
        descuento = cantidadSin - cantidadCon;
        return (descuento/cantidadSin)*100;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidadSin, cantidadCon;
        
        System.out.println("Introduce el el precio sin descuento: ");
        cantidadSin = sc.nextDouble();
        System.out.println("Introduce el descuento: ");
        cantidadCon = sc.nextDouble();
        
        System.out.println(descuento(cantidadSin, cantidadCon));

    }
}

