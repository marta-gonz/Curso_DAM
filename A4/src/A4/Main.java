/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package A4;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/


public class Main {
    //Calculo precio con iva
    public static double precioIVA(double precio) {
        return precio * 1.21;
    }

    public static void main(String[] args) {
        Articulo objeto = new Articulo();
        
        objeto.precio = 10;
        objeto.nombre = "Pijama";
        objeto.cuantosQuedan = 5;
        
        
        //Mostrar informacion
        System.out.println(objeto.nombre + " - Precio:" + objeto.precio + "€ - IVA:" + objeto.IVA + "% - PVP:" + precioIVA(objeto.precio) + "€");
        
        //Cambiar valores
        objeto.precio = 23;
        objeto.nombre = "Estuche";
        objeto.cuantosQuedan = 27;
        
        //Mostrar informacion
        System.out.println(objeto.nombre + " - Precio:" + objeto.precio + "€ - IVA:" + objeto.IVA + "% - PVP:" + precioIVA(objeto.precio) + "€");

        
    }
}

