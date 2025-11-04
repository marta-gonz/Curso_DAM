/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod3;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int max = 100;
        int min = 0;
        int num = 50;
        char respuesta;
        boolean seguir = true;
        
        System.out.println("Piensa en un número entre 0 y 100.");
        System.out.println("Responde con: '>' si tu número es mayor, '<' si es menor, '=' si lo adiviné.");
        
        while (seguir) {
            System.out.println("¿El número es " + num + "?");
            respuesta = sc.next().charAt(0); 
            
            
            switch (respuesta) {
                case '<':
                    max = num;
                    break;
                case '>':
                    min = num;
                    break;
                case '=':
                    seguir = false;
                    System.out.println("¡He adivinado tu número!");
                    break;
                default:
                    System.out.println("Respuesta no válida. Usa '>', '<' o '='.");
            }
            
            if (seguir) {
                if (num == 99) {
                    num = 100;
                } else {
                    num = (max + min) / 2;
                }
            }
        }
        
        sc.close();
    }
}

