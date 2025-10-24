package mod1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el precio ");
		double precio = entrada.nextInt();
		System.out.println("Introduce el precio de venta ");
		double precioVenta = entrada.nextInt();
		
		double descuento = ((precio-precioVenta)/precio)*100;
		
		System.out.println("El descuento es de: " + descuento);
		

	}

}