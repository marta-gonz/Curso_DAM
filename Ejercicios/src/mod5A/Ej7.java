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
public class Ej7 {
    public static void main(String[] args) {

        int num, neg, pos;
        
        Scanner sc = new Scanner(System.in);
        
        neg = 0;
        pos = 0;
        for (int i=0; i<10;i++) {
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            
            if (num<0) {
                neg+=1;
            } else {
                pos+=1;
            }
            
        }
        System.out.println("Numeros positivos: " + pos);
        System.out.println("Numeros negativos: " + neg);
        
    }
}
