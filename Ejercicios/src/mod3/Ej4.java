package mod3;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println(i);
		}

	}

}
