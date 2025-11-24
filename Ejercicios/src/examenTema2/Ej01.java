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
public class Ej01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Creacion variables
        double precio;
        int codPromo;
        int iva;
        double precioFinal=0;
        
        //Preguntamos al usuario
        System.out.println("Introduzca el precio (base imponible): ");
        precio = sc.nextDouble();
        System.out.println("Introduzca el codigo promocional (1:nopromo, 2:mitad, 3:menos5, 4:porcentaje5): ");
        codPromo=sc.nextInt();
        System.out.println("Introduzca el IVA (1: superreducido, 2:reducido, 3: general): ");
        iva = sc.nextInt();
        
        //Comprobamos si tiene promocion
        if (codPromo==1) {
            System.out.println("No se aplica promocion");
        } else if (codPromo==2) {
            precio/=2;
        } else if (codPromo==3) {
            precio -= 5;
        } else if (codPromo==4) {
            precio = precio-((precio*5)/100);
        }
        
        //Aplcicamos el IVA
        if (iva==1) {
            precioFinal = ((precio*4)/100)+precio;
        } else if (iva==2) {
            precioFinal = ((precio*10)/100)+precio;
        } else if (iva==3) {
            precioFinal = ((precio*21)/100)+precio;
        } else {
            System.out.println("Dato mal introducido");
        }
        
        //Mostrarmos resultado
        System.out.println("El precio total es: " + precioFinal);
        
        
        
    } //main
} //class
