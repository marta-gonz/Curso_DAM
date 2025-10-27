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
public class Ej26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int centena, unidad, num;
        
        System.out.println("Introduce un numero de 3 cifras:  ");
        num = sc.nextInt();
        
        if (num<100 && num>999) {
            System.out.println("El numero no tiene 3 cifras");
        } else {
            centena = Math.round(num/100);
            unidad = num%10;
           
            if (unidad==centena) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        }

    }
}
