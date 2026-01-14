/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package A2;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class Main {
    public static void main(String[] args) {
        
        //Instanciar los objetos
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        //Perdir por teclado datos
        Scanner sc = new Scanner(System.in);
        
        System.out.println("DATOS PERSONA 1");
        System.out.println("Introduce el DNI");
        p1.dni = sc.nextLine();
        System.out.println("Introduce el nombre");
        p1.nombre = sc.nextLine();
        System.out.println("Introduce el apellido");
        p1.apellidos = sc.nextLine();
        System.out.println("Introduce la edad");
        p1.edad = sc.nextInt();
        
        System.out.println("DATOS PERSONA 2");
        System.out.println("Introduce el DNI");
        p2.dni = sc.nextLine();
        System.out.println("Introduce el nombre");
        p2.nombre = sc.nextLine();
        System.out.println("Introduce el apellido");
        p2.apellidos = sc.nextLine();
        System.out.println("Introduce la edad");
        p2.edad = sc.nextInt();
        
        // Calcular si es mayor de edad
        //“Azucena Luján García con DNI … es / no es mayor de edad”.
        
        String cadena1 = p1.nombre + " " + p1.apellidos + " con " + p1.dni;
        String cadena2 = p2.nombre + " " + p2.apellidos + " con " + p2.dni;
       
        if (p1.edad >= 18) {
            cadena1 += " es mayor de edad";
        } else {
            cadena1 += " no es mayor de edad";
        }
        
        if (p2.edad >= 18) {
            cadena2 += " es mayor de edad";
        } else {
            cadena2 += " no es mayor de edad";
        }
        
        System.out.println(cadena1);
        System.out.println(cadena2);
        
    } //main
} //class
