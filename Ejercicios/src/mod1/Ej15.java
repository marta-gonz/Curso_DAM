package mod1;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();
		System.out.println("Numero 3: ");
		int num3 = sc.nextInt();
		
                System.out.println("METODO 1");
                // Usamos una serie de if anidados, esta es la forma mas larga
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El mayor es: " + num1);
			} else {
				System.out.println("El mayor es: " + num3);
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("El mayor es: " + num2);
			} else {
				System.out.println("El mayor es: " + num3);
			}
		}
                
                
                System.out.println("METODO 2");
                //Creamos una variable max en la que vamos guardando los mayores
               
                int max;
                max = 0;
                if (num1 > num2) {
                    max=num1;
                    if (max < num3) {
                        max = num3;
                    }
                } else if (num2 > num1) {
                    max = num2;
                    if(max<num3) {
                        max=num3;
                    }
                }
              
                    
                System.out.println("El mayor es: " + max);
                
                System.out.println("METODO 3");
                //Usamos el metodo max de la clase Math, lo usamos dos veces seguidas ya que este solo compara dos numeros
                
                int mayor;
                mayor = Math.max(Math.max(num1, num2),num3);
                
                System.out.println("El mayor es: " + mayor);
            

	}

}
