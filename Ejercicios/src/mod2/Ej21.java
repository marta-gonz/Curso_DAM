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
public class Ej21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int segDia, segHoy, resultado;
        
        System.out.println("Introduce la hora: ");
        int hora = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int min = sc.nextInt();
        
        if (min==0 && hora==0) {
            System.out.println("Es media noche justo");
        } else {
            min = min * 60;
            hora = (hora*60)*60;
            
            segDia = 24*60*60;
            segHoy = min + hora;
            
            resultado = segDia - segHoy;
            
            System.out.println("Para medianoche faltan: " + resultado + " segundos");
        }

    }
}
