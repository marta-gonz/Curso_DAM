/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package B2;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class Main {
    public static void main(String[] args) {
        
        //Instanciar los objetos
        Persona p1 = new Persona("123", "Marta", "Gonzalez", 18);
        Persona p2 = new Persona("321", "Maria", "Bermudez", 15);
        
        // Calcular si es mayor de edad
        
        String cadena1 = p1.nombre + " " + p1.apellidos + " con dni " + p1.dni;
        String cadena2 = p2.nombre + " " + p2.apellidos + " con dni " + p2.dni;
       
        if (p1.edad >= 18) {
            cadena1 += " es mayor de edad";
        } else {
            cadena1 += " no es mayor de edad";
        }
        
        if (p2.edad >= 18) {
            cadena2 += " es mayor de edad";
        } else {
            cadena2 += " no es mayor de edad";
        }
        
        System.out.println(cadena1);
        System.out.println(cadena2);
        
    } //main
} //class
