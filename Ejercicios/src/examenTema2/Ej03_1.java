/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package examenTema2;

import java.util.*;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class Ej03_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Creamos las variables que vamos a utilizar
        int altura = 0;
        int blancos =1;
        int asteriscos = altura-1;
        
        //Con un bucle repetimos que introduzca la altura hasta que sea mayor que 5
        do {
            //Usamos el try catch para comprobar que el tipo de datos introducido es correcto
            try{
                System.out.println("Intorduce la altura: ");
                altura = sc.nextInt(); 
            }
            catch(InputMismatchException e) {               
                System.err.println("Valor no valido, tipo de excepcion " + e.toString());                                             
                sc.nextLine();
            }
        } while (altura < 5);
        
        
        
        //Bucle para dibujar solo la primera linea
        for (int l = 0; l < altura; l++) {
                System.out.print("*");
            }
            System.out.println("");
        
        //Bucle para dibujar el resto de la figura
        for (int i = 0; i < altura-1 ; i++) {
 
            //Blancos
            for (int j = 0; j < blancos; j++) {
                System.out.print(" ");
            }
            
            //Asteriscos
            for (int j = 1; j <= asteriscos; j++) {
                if (j==1 || j==asteriscos) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            
            System.out.println("");
            blancos++;
            asteriscos--;
        }
   
        
    } //main
} //class
