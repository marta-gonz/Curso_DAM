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
public class Articulo {
    String nombre;
    double precio;
    int cuantosQuedan;
    int IVA;

    public Articulo(String nombre, double precio, int cuantosQuedan, int IVA) {
        
        if (precio < 0 || cuantosQuedan < 0 || IVA != 21) {
            System.err.println("Un dato a sido mal introducido");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.cuantosQuedan = cuantosQuedan;
            this.IVA = IVA;
        }
        
    }
    
    
    
    
}

