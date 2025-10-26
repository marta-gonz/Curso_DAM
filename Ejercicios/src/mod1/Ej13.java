package mod1;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce primer numero: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce segundo numero: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + ", " + num2);
		} else {
			System.out.println(num2 + ", " + num1);
		}

	}

}
