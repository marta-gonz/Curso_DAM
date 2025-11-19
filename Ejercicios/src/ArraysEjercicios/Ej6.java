/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysEjercicios;

import java.util.Scanner;


/* -----------------T3-MOD-Ej6------------------*/
/* Crea un programa que pida dos valores enteros N y M, luego cree un array de 
tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.*/
/**
 *
 * @author Marta González
 */
public class Ej6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n, m;
        System.out.println("Tamaño array: ");
        n = sc.nextInt();
        System.out.println("Valor: ");
        m = sc.nextInt();
        
        int[] numero = new int[n];
        
        for (int i = 0; i < numero.length; i++) {
            numero[i] = m;
        }
        
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]+ " ");
        }
        System.out.println("");
    } //main
} //class
