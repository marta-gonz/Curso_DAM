package rusian;

import java.util.Scanner;

public class rusian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num1 = entrada.nextInt();
		System.out.println("Introduce un numero: ");
		int num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " es mayor");
		} else if (num2 > num1) {
			System.out.println(num2 + "es mayor");
		} else {
			System.out.println("Son iguales");
		}
		
	}

}
