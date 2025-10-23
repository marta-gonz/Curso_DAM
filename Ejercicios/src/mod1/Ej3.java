package mod1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el lado");
		int lado = entrada.nextInt();
		
		int area = lado*lado;
		System.out.println("El area es: " + area);

	}

}
