/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArraysD;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Realiza un programa que calcule la estatura media, mínima y máxima en 
centímetros de personas de diferentes países. El vector que contiene los 
nombres de los países es el siguiente: país = {“España”, “Rusia”, “Japón”, 
“USA”}. Los datos sobre las estaturas se deben simular mediante un array de 
4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 
210. Los decimales de la media se pueden despreciar. Los nombres de los países 
se deben mostrar utilizando el array de países (no se pueden escribir 
directamente).
*/
/**
 *
 * @author Marta González
 */
public class Ej9 {
    public static void main(String[] args) {

        String[] pais = {"Espania", "Rusia", "Japon", "USA"};
        int[][] estaturas = new int[4][10];
        
        int min, max, media;
        min = 210;
        max = 140;
        
        for (int i = 0; i < estaturas.length; i++) {
            System.out.print(pais[i] + " | ");
            for (int j = 0; j < estaturas[0].length; j++) {
                estaturas[i][j] = (int)(140+Math.random()*70);
                System.out.print(estaturas[i][j]+ " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[0].length; j++) {
                
                if (estaturas[i][j] > max) {
                    min = estaturas[i][j];
                } else {
                    max = estaturas [i][j];
                }
                System.out.println();
            }    
        }
        
    } //main
} //class
