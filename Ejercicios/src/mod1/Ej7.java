package mod1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce distancia: ");
		int millas = entrada.nextInt();
		
		int distancia = millas * 1852;
		System.out.println("La distancia en millas marinas es de: " + distancia);

	}

}
