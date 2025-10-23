package mod1;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int num1 = entrada.nextInt();
		System.out.println("Numero 2: ");
		int num2 = entrada.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + " es el mayor");
		} else {
			System.out.println(num2 + " es el mayor");
		}

	}

}
