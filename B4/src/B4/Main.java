/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package B4;

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
        Articulo objeto = new Articulo("Pijama", 10, 5, 21);
        Articulo objeto2 = new Articulo("Iphone", -1, 6, 21);
        Articulo objeto3 = new Articulo("Pijama", 10, 5, 20);
        Articulo objeto4 = new Articulo("Pijama", 10, -12, 20);
        
           
        //Mostrar informacion
        System.out.println(objeto.nombre + " - Precio:" + objeto.precio + "€ - IVA:" + objeto.IVA + "% - PVP:" + precioIVA(objeto.precio) + "€");
        System.out.println(objeto2.nombre + " - Precio:" + objeto2.precio + "€ - IVA:" + objeto2.IVA + "% - PVP:" + precioIVA(objeto2.precio) + "€");
        System.out.println(objeto3.nombre + " - Precio:" + objeto3.precio + "€ - IVA:" + objeto3.IVA + "% - PVP:" + precioIVA(objeto3.precio) + "€");
        System.out.println(objeto4.nombre + " - Precio:" + objeto4.precio + "€ - IVA:" + objeto4.IVA + "% - PVP:" + precioIVA(objeto4.precio) + "€");

        
    }
}

