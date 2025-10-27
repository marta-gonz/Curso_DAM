/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod2;

import java.util.Scanner;

/**
 *
 * @author Marta González
 */
public class Ej19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int dia;
        
        System.out.println("Escribe el dia de la semana (1-5): ");
        dia = sc.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lenguaje de marcas");
                break;
            case 2:
                System.out.println("Programación");
                break;
            case 3:
                System.out.println("Sistemas informáticos");
                break;
            case 4:
                System.out.println("Sostenibilidad");
                break;
            case  5:
                System.out.println("Programación");
                break;
            default:
                System.out.println("El dia introducido no es correcto");
        }
       

    }
}
