package mod1;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota (0-10): ");
		int nota = sc.nextInt();
		
		if (nota>=0 && nota<3) {
			System.out.println("Muy deficiente");
		} else if (nota>=3 && nota<5) {
			System.out.println("Insuficiente");
		} else if (nota>=5 && nota<=6) {
			System.out.println("Bien");
		} else if (nota>6 && nota<9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}

	}

}
