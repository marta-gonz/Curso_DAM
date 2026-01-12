package ArraysA;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {

        /* -----------------T3-MOD-Ej2------------------*/
        /*Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
        Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
        mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
        por debajo de la media.*/
        /**
         *
         * @author Marta González
         */
	Scanner sc = new Scanner(System.in);
        
        int n;
        int max = 0, min = 0, suma = 0, media;
        
        System.out.println("Introduce un numero");
        n = sc.nextInt();
        
        int[] alturas = new int[n];
        
        System.out.println("Introduce las alturas");
        
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = sc.nextInt();
            
        }
        
        max = alturas[0];
        min = alturas[0];
        
        for (int i = 0; i < alturas.length; i++) {
            
            if (alturas[i] > max) {
                max = alturas[i];
            } 
            
            if (alturas[i]< min) {
                min = alturas[i]; 
            }
     
            suma += alturas[i];
        }
        
        media = suma/n;
        
        System.out.println("Altura maxima: " + max);
        System.out.println("Altura minima: " + min);
        System.out.println("Altura media: " + media);
        
        for (int i = 0; i < alturas.length; i++) {
            
            if (alturas[i] > media) {
                System.out.println("Persona " + i + " es mayor a la media");
            } else {
                System.out.println("Persona " + i + " es menor a la media");
            }
        }
        
        
	
    }

}
