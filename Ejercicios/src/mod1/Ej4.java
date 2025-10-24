package mod1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce primer numero ");
		int num1 = entrada.nextInt();
		
		System.out.println("Introduce segundo numeo ");
		int num2 = entrada.nextInt();
		
		System.out.println("La suma es: " + (num1+num2));
		System.out.println("La suma es: " + (num1-num2));
		System.out.println("La suma es: " + (num1*num2));
		System.out.println("La suma es: " + (num1/num2));
                

	}

}
