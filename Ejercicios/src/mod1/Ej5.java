package mod1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el radio: ");
		double radio = entrada.nextDouble();
		
		double longCircunferencia = 2*Math.PI*radio;
		double areaCirc = Math.PI*Math.pow(radio, 2);
		double volumen = 4/3*Math.PI*Math.pow(radio, 3);
		
		System.out.println("La longitud es: " + longCircunferencia);
		System.out.println("El area es: " + areaCirc);
		System.out.println("El volumen es: " + volumen);

	}

}
