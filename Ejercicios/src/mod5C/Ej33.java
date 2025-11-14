/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5C;

import java.util.Scanner;


/* -----------------T2-MOD5-Ej33------------------*/
/*Escribe un programa que muestre 20 notas generadas al azar. 
Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o 
sobresaliente. Al final aparecerá el número de suspensos, el número de 
suficientes, el número de bienes, etc.*/
/**
 *
 * @author Marta González
 */
public class Ej33 {
    public static void main(String[] args) {

        int nota;
        int suspenso, suficiente, bien, notable, sobresaliente;
        suspenso=0;
        suficiente=0;
        bien=0;
        notable=0;
        sobresaliente=0;
        
        for (int i = 1; i <= 20; i++) {
          nota = (int)(Math.random()*6);
          
          switch (nota) {
              case 1:
                  System.out.println(i+".-Suspenso");
                  suspenso +=1;
                  break;
              case 2:
                  System.out.println(i+".-Suficiente");
                  suficiente+=1;
                  break;
              case 3:
                  System.out.println(i+".-Bien");
                  bien+=1;
                  break;
              case 4:
                  System.out.println(i+".-Notable");
                  notable+=1;
                  break;
              case 5:
                  System.out.println(i+".-Sobresaliente");
                  sobresaliente+=1;
                  break;
          }
            
            
        }
            System.out.println("---------------------------------");
            System.out.println("Suspensos = " + suspenso);
            System.out.println("Suficiente = " + suficiente);
            System.out.println("Bien = " + bien);
            System.out.println("Notable = " + notable);
            System.out.println("Sobresaliente = " + sobresaliente);
        
    } //main
} //class
