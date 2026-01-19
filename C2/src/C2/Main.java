/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package C2;

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
        
        String cadena1 = p1.getNombre() + " " + p1.getApellidos() + " con dni " + p1.getDni();
        String cadena2 = p2.getNombre() + " " + p2.getApellidos() + " con dni " + p2.getDni();
       
        if (p1.getEdad() >= 18) {
            cadena1 += " es mayor de edad";
        } else {
            cadena1 += " no es mayor de edad";
        }
        
        if (p2.getEdad() >= 18) {
            cadena2 += " es mayor de edad";
        } else {
            cadena2 += " no es mayor de edad";
        }
        
        System.out.println(cadena1);
        System.out.println(cadena2);
        
    } //main
} //class
