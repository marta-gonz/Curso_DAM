/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod2;

import java.util.Scanner;

/**
 *
 * @author Marta González
 */
public class Ej20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la hora");
        int  hora = sc.nextInt();
        
        if (hora>=6 && hora <=12) {
            System.out.println("Buenos dias");
        } else if (hora>=13 && hora<=20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas  noches");
        }

    }
}
