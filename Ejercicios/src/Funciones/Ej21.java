/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funciones;

import java.util.Scanner;
/**
 * Ejercicio numero 21 de la parte de Funciones
 * @author Marta González
 */
/**/
public class Ej21 {
    
    static Scanner sc = new Scanner(System.in);
    
    /**
     * Muestra un menu con 5 opciones
     * @return La opcion elegida por el usuario
     */
    public static int menu() {

        System.out.println("1.- Circunferencia");
        System.out.println("2.- Area");
        System.out.println("3.- Volumen");
        System.out.println("4.- Todas");
        System.out.println("5.- Salir");

        return sc.nextInt();
    }
    
    /**
     * Pide al usuario que introduzca el radio
     * @return El radio elegido por el usuario
     */
    public static double pideRadio() {
        System.out.println("Introduce el radio: ");
        return sc.nextDouble();
    }
    
    /**
     * Calcula la Circunferencia a partir del radio dado por el usuario
     * @param r radio
     * @return la circunferencia
     */
    public static double circunferencia(double r) {
        
        return 2*Math.PI*r;
    }
    
    /**
     * Calcula el area a partir del radio dado por el usuario
     * @param r radio 
     * @return el area
     */
    public static double area(double  r) {
        
        return Math.PI*r*r;
    }
    
    /**
     * Calcula el volumen a partir del radio dado por el usuario
     * @param r radio
     * @return el volumen
     */
    public static double volumen(double r) {
        return (4.0/3)*Math.PI*Math.pow(r, 3);
    }
    
    
    public static void main(String[] args) {   
        
        int menu;
        double radio;
        do {
            menu = menu();
            switch (menu) {
            case 1: 
                radio = pideRadio();
                System.out.println("La circunferencia es: ");
                System.out.println(circunferencia(radio));
                break;
            case 2:
                radio = pideRadio();
                System.out.println("El area es: ");
                System.out.println(area(radio));
                break;
            case 3:
                radio = pideRadio();
                System.out.println("El volumen es: ");
                System.out.println(volumen(radio));
                break;
            case 4:
                radio = pideRadio();
                System.out.println("La circunferencia es: ");
                System.out.println(circunferencia(radio));
                System.out.println("El area es: ");
                System.out.println(area(radio));
                System.out.println("El volumen es: ");
                System.out.println(volumen(radio));
                break;
            case 5:
                System.out.println("Saliste del programa");
                break;
            default:
                System.out.println("Opcion no valida");
            }    
        } while (menu!=5);
                
    }
        
    
}
