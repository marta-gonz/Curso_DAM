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
public class Ej8 {
    public static void main(String[] args) {

        
        int num, neg, pos;
        
        Scanner sc = new Scanner(System.in);
        neg = 0;
        pos = 0;
        num = 1;
        
        while (num!=0) {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            
            if (num<0) {
                neg+=1;
            } else {
                pos +=1;
            }
            
        System.out.println("Numeros negativos: " + neg);
        System.out.println("Numeros positivos: " + pos);
        }
    }
}
