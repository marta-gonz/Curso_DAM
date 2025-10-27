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
public class Ej24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int tipoCarne, modoCoccion, peso, tiempo=0;
        
        System.out.println("Introduce el tipo de carne (1.-Vacuno, 2.-Cordero)");
        tipoCarne = sc.nextInt();
        System.out.println("Introduce el modo coccion (1.-Cruda, 2.-Punto, 3.-Hecha)");
        modoCoccion = sc.nextInt();
        System.out.println("Introduce el pese: ");
        peso = sc.nextInt();
        
        if (tipoCarne==1) {
            if (modoCoccion==1) {
                tiempo = ((peso * 10)/500)*60;
            } else if (modoCoccion==2) {
                tiempo = ((peso * 17)/500)*60;
            } else {
                tiempo = ((peso * 25)/500)*60;
            }
        } else if (tipoCarne==2) {
            if (modoCoccion==1) {
                tiempo = ((peso * 15)/400)*60;
            } else if (modoCoccion==2) {
                tiempo = ((peso * 25)/400)*60;
            } else {
                tiempo = ((peso * 40)/400)*60;
            }
        }
        
        System.out.println("El tiempo de coccion es de: " + tiempo +  " segundos");
        

    }
}
