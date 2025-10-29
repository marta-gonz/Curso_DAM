/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mod3;

import java.util.Scanner;

/**
 *
 * @author Marta González
 */
public class Ej6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, neg;
        neg = 0;
        for (int i=0; i<=10; i++) {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            
            if (num < 0) {
                neg +=1;
            }
        }
        System.out.println("Has introducido " + neg + " numeros negativos");
        
    }
}
