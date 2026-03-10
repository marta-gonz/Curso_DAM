/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package C4;

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
        System.out.println(objeto.getNombre() + " - Precio:" + objeto.getPrecio() + "€ - IVA:" + objeto.getIVA() + "% - PVP:" + precioIVA(objeto.getPrecio()) + "€");
        System.out.println(objeto2.getNombre() + " - Precio:" + objeto2.getPrecio() + "€ - IVA:" + objeto2.getIVA() + "% - PVP:" + precioIVA(objeto2.getPrecio()) + "€");
        System.out.println(objeto3.getNombre() + " - Precio:" + objeto3.getPrecio() + "€ - IVA:" + objeto3.getIVA() + "% - PVP:" + precioIVA(objeto3.getPrecio()) + "€");
        System.out.println(objeto4.getNombre() + " - Precio:" + objeto4.getPrecio() + "€ - IVA:" + objeto4.getIVA() + "% - PVP:" + precioIVA(objeto4.getPrecio()) + "€");

        
    }
}

