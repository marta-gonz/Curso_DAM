/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ProyectoStarWars;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Productorio entre P1 y P2. Por ejemplo con P1=5, P2=10, la respuesta correcta sería
5*6*7*8*9*10 = 151200.
*/
/**
 *
 * @author Marta González
 */
public class nivel2 {
    public static void main(String[] args) {

        int p1, p2;
        int respuesta, producto, cont;
        
        
        p1 = (int)(1+Math.random()*7);
        p2 = (int)(8+Math.random()*4);
        
        cont=p1+1;
        producto = p1;
        for (int i = p1; i < p2; i++) {
            producto = producto*cont;
            cont++;
        }
        
        
        
    } //main
} //class
