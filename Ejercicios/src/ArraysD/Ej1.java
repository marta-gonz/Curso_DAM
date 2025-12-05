/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysD;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Se desean guardar y representar las notas de 5 alumnos en 4 asignaturas 
(números aleatorios con decimales entre 0 y 10) en una matriz. Además, tanto 
para cada asignatura como para cada alumno, se precisa obtener y almacenar la 
nota máxima, mínima y la media aritmética. Diseña una estructura de datos 
(represéntala primero en un papel) y un algoritmo adecuado para ello.
*/
/**
 *
 * @author Marta González
 */
public class Ej1 {
    public static void main(String[] args) {

        double[][] notasAsig = new double[5][4];
        double max, min, suma, media;
        suma = 0;
        max = 0;
        min = 10;
        for (int i = 0; i < notasAsig.length; i++) {
            System.out.print("Alumno"  + (i+1) + ": ");
            for (int j = 0; j < notasAsig[0].length; j++) {
                notasAsig[i][j] = Math.random()*10;
                System.out.print(String.format("%.2f", notasAsig[i][j]) + " ");  

                }  
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int i = 0; i < notasAsig.length; i++) {
            for (int j = 0; j < notasAsig[0].length; j++) {
                if (notasAsig[i][j] < min) {
                    min = notasAsig[i][j];
                }
                
                if (notasAsig[i][j] > max) {
                    max = notasAsig[i][j];
                }
                
                suma  += notasAsig[i][j];

            }
            System.out.println("ALUMNO " + (i+1));
            System.out.println("El maximos es: " + String.format("%.2f",max));
            System.out.println("El minimo es: " + String.format("%.2f",min));
            System.out.println("La media es: " + String.format("%.2f", suma/4));
            max = 0;
            min = 10;
            suma=0;
        }
        
    } //main
} //class
