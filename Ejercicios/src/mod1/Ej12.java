package mod1;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int num = entrada.nextInt();
		
		if (num >= 0) {
			System.out.println("Es positivo");
		} else {
			System.out.println("Es negativo");
		}

	}

}
