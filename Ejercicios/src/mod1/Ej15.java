package mod1;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();
		System.out.println("Numero 3: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El mayor es: " + num1);
			} else {
				System.out.println("El mayor es: " + num3);
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("El mayor es: " + num2);
			} else {
				System.out.println("El mayor es: " + num3);
			}
		}

	}

}
