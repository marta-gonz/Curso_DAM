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
/*Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
millas.*/
public class Ej12 {
    public static double millas(double kilometros) {
        return 0.621371 * kilometros;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometros;
        
        System.out.println("Introduce el numero de kilometros: ");
        kilometros = sc.nextDouble();
        
        System.out.println(millas(kilometros));
    }
}

