package mod1;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce primer numero: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce segundo numero: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Son iguales");
		} else if (num1 > num2) {
			System.out.println("El mayor es: " + num1);
		} else {
			System.out.println("El mayor es: " + num2);
		}

	}

}
