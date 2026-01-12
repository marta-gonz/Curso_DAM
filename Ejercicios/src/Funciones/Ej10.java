/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Funciones;

import java.util.*;

/**
 *
 * @author Marta
 */
/*Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
función donde le pasemos los datos y devuelva si es correcta o no.
*/
public class Ej10 {
    
    public static boolean fecha(int dia, int mes, int año) {
        boolean correcto;
        
        if (dia <= 0 || dia > 30) {
            return false;
        }
        if (mes <=0 || mes > 12) {
            return false;
        }
        if (año <0) {
            return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        
        System.out.println("Introduce el dia: ");
        dia = sc.nextInt();
        System.out.println("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        año = sc.nextInt();
        
        
        
        if (fecha(dia, mes, año)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    }
}

