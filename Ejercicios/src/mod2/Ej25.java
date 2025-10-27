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
public class Ej25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        
        if (num%2==0 && num%3==0){
            System.out.println("Es multiplo de 2 y 3");
        } else if (num%2==0) {
            System.out.println("Es multiplo de 2");
        } else if (num%3==0) {
            System.out.println("Es multiplo de 3");
        } else {
            System.out.println("No es multiplo de 2 ni de 3");
        }

    }
}
