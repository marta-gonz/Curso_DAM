/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej32------------------*/
/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno 
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud 
aleatoria entre 1 y 40 caracteres.
*/
/**
 *
 * @author Marta González
 */
public class Ej32 {
    public static void main(String[] args) {

        String caracter="";
        int longitud;
        int numero;
        
        for (int i = 0; i < 10; i++) {
            
             longitud = (int)(Math.random()*41);
            for (int j = 0; j < longitud; j++) {
                
            
            numero = (int)(Math.random()*7);
            
            switch (numero) {
                case 1:
                    caracter = "*";
                    break;
                case 2:
                    caracter = "-";
                    break;
                case 3:
                    caracter = "=";
                    break;
                case 4:
                    caracter = ".";
                    break;
                case 5:
                    caracter = "|";
                    break;
                case 6:
                    caracter = "@";
                    break;
            }
            
            System.out.print(caracter);
           
            }
            System.out.println("");
            
        }
    } //main
} //class
