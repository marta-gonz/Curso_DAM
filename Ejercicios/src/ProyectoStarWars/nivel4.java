/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ProyectoStarWars;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*1 si P es primo, 0 en caso contrario.
Por ejemplo, si P=11 como 11 es primo se introduce un 1.
*/
/**
 *
 * @author Marta González
 */
public class nivel4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int respuesta;
        boolean esPrimo=true;
        int p = (int)(10+Math.random()*100);
        
        System.out.println("El numero es: " + p);
        System.out.println("¿Es primo?(1/0)");
        respuesta = sc.nextInt();
        
        for (int i = 2; i < p; i++) {
            if (p%i==0) {
                esPrimo=false;
            }
        }
        if (respuesta==1 && esPrimo) {
            System.out.println("Correcto, es primo");
        } else if (respuesta==0 && esPrimo==false){
            System.out.println("Correcto, no es primo");
        } else {
            System.out.println("Incorrecto");
        }
        
    } //main
} //class
