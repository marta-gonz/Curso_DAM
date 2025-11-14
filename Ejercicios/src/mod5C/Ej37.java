/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej37------------------*/
/*Escribe un programa que sea capaz de insertar un dígito dentro de un número 
indicando la posición. El nuevo dígito se colocará en la posición indicada y 
el resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan 
de izquierda a derecha empezando por el 1. Se recomienda usar long en lugar de 
int ya que el primero admite números más largos. Se debe garantizar la correcta 
introducción de los datos.*/
/**
 *
 * @author Marta González
 */
public class Ej37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero positivo: ");
        long num = sc.nextLong();
        System.out.println("Introduce la posicion: ");
        long pos = sc.nextLong();
        System.out.println("Introduce el digito a insertar: ");
        long digito = sc.nextLong();
        
        
    } //main
} //class
