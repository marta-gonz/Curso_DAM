/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package B3;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public class Main {
    public static void main(String[] args) {
        
        //Creamos los objetos
        Rectangulo r1 = new Rectangulo(0,5,0,5);
        Rectangulo r2 = new Rectangulo(7,2,9,3);

                
        //Calcular perimetro y area
        int alto1, ancho1;
        int perimetro1, area1;
        ancho1 = Math.abs(r1.x2-r1.x1);
        alto1 = Math.abs(r1.y2-r1.y1);
        
        perimetro1 = (ancho1+alto1)*2;
        area1 = ancho1*alto1;
        
        int alto2, ancho2;
        int perimetro2, area2;
        ancho2 = Math.abs(r2.x2-r2.x1);
        alto2 = Math.abs(r2.y2-r2.y1);
        
        perimetro2 = (ancho2+alto2)*2;
        area2 = ancho2*alto2;
        
        
        // Mostrar coodenadas, perimetro y area
        System.out.print("RECTANGULO 1: ");
        System.out.println("("+r1.x1+","+r1.y1+")("+r1.x2+","+r1.y2+")");
        System.out.println("El perimetro es: " + perimetro1);
        System.out.println("El area es: " + area1);
        System.out.print("RECTANGULO 2: ");
        System.out.println("("+r2.x1+","+r2.y1+")("+r2.x2+","+r2.y2+")");
        System.out.println("El perimetro es: " + perimetro2);
        System.out.println("El area es: " + area2);
    
    }
}

