/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author Marta González
 */
/*Implementa la siguiente función sobrecargada:
- int aleatorio (int a, int b) //Devuelve un número aleatorio entre a y b
- double aleatorio (double x, double y) //Idem anterior, pero con double
- void aleatorio (int a, int b, int n) //Imprime n números aleatorio entre a y b
- void aleatorio (double x, double y, int n) //Idem anterior, pero con double*/
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public int aleatorio(int a, int b) {
        return (int)(a+Math.random()*b);
    }
    
    public double aleatorio(double a, double b) {
        return (a+Math.random()*b);
    }
    
    public void aleatorio(int a, int b, int n) {
        int num;
        for (int i = 1; i <= n; i++) {
            num = (int)(a+Math.random()*b);
            System.out.println(num);
        }
    }
    
    public void aleatorio(double a, double b, double n) {
        double num;
        for (int i = 1; i <= n; i++) {
            num = (a+Math.random()*b);
            System.out.println(num);
        }
    }
    
}
