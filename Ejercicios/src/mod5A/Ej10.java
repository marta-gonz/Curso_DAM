/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod5A;

import java.util.Scanner;

/**
 *
 * @author Marta González
 */
public class Ej10 {
    public static void main(String[] args) {

        
        int nota, bien;
        
        Scanner sc = new Scanner(System.in);
        nota = 0;
        bien = 0;
        
        do {    
            if (nota==10) {
                bien +=1;
            }
            
            System.out.println("Introduce una nota: ");
            nota = sc.nextInt();  
            
        } while (nota!=-1);
        
        System.out.println("Has tenido: " + bien   + " diez");
    }
}
