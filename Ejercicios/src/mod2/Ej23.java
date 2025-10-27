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
public class Ej23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int año1, año2, año3;
        
        System.out.println("Indica año de nacimiento: ");
        System.out.println("Persona 1: ");
        año1 = sc.nextInt();
        System.out.println("Persona 2: ");
        año2 = sc.nextInt();
        System.out.println("Persona 3: ");
        año3 = sc.nextInt();

        
        if (año1==año2 && año1==año3) {
            System.out.println("Las tres personas son de la misma quinta");
        } else if (año1==año2) {
            System.out.println("Perona 1 y 2 son de la misma quinta");
        } else if (año1==año3) {
            System.out.println("Perona 1 y 3 son de la misma quinta");
        } else if (año2==año3) {
            System.out.println("Persona 2 y 3 son de la misma quinta");
        } else {
            System.out.println("Ninguno es de la misma quinta");
        }
    }
}
