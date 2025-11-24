/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package examenTema2;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class Ej02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Variables 
        short num, div;
        short copia;
        int suma=0, suma2=0;
        
        //Preguntamos al usuario
        System.out.println("Introduce un numero: ");
        num=sc.nextShort();
        System.out.println("Introduce un divisor: ");
        div=sc.nextShort();
        
        //Hacemos copia del numero
        copia = num;
        
        System.out.println("ANTERIORES:  ");
        
        //Bucle para los numeros anteriores
        do {
            if (copia%div==0) {
                //Comprobamos que el numero es mayor que 0
                if (copia <= 0) {
                    System.out.println("");
                } else {
                    System.out.println(copia);
                }
                suma2+=1;
            } else {
                suma2=suma2;
            }
            copia--;
        } while (suma2<5);
        
        System.out.println("POSTERIORES: ");
        
        //Bucle para los numeros posteriores
        do {
            if (num%div==0) {
                System.out.println(num);
                suma+=1; 
            } else  {
                suma=suma;
            }
            num++;
        } while (suma<5);
        
        
    } //main
} //class
