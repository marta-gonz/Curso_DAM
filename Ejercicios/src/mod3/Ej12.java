/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod3;

import java.util.Scanner;

/**
 *
 * @author Marta González
 */
public class Ej12 {
    public static void main(String[] args) {

        double base, exponente, potencia;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la base: ");
        base = sc.nextInt();
        System.out.println("Introduce el exponente: ");
        exponente = sc.nextInt();
        
        potencia = Math.pow(base, exponente);
        System.out.println("La potencia es: " + potencia);
        
        
        
        
    }
}
