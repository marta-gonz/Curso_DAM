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
public class Articulo {
    private String nombre;
    private double precio;
    private int cuantosQuedan;
    private int IVA;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.err.println("Error el precio es menor que 0");
        }    
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.err.println("Error no pueden quedar menos de 0");
        }
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        if (IVA != 21 ) {
            System.out.println("Error el iva debe ser 21");
        } else {
            this.IVA = IVA;
        }
    }
    
    
    
    
}

