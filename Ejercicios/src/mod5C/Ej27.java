/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej27------------------*/
/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. 
El programa pedirá la altura. 
El palo horizontal de la L tendrá una longitud 
de la mitad (división entera entre 2) de la altura más uno.
*/
/**
 *
 * @author Marta González
 */
public class Ej27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();
        int base = (altura/2)+1;
        
        for (int i =1; i < altura; i++) {
            System.out.println("*");
        }
        for (int j = 0; j < base; j++) {
            System.out.print("* ");
        }
        System.out.println("");
    } //main
} //class
