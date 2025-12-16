/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package proyecto;
import java.util.Scanner;

/*   --------T2-MOD6-Ej-------- */
/**
 *
 * @author María González
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        //VARIABLES
        int S1;
        int S2;
        int N;
        int factorial=1;
        int suma=0;
        int cont=1;
        int M;
        int S;
        int fact1=1;
        int fact2=1;
        int respuesta;
        boolean perder=false;
       
        
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ==="); 
        
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n" +
        "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
        "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
        "está construyendo para destruirla. "+ 
        "(Presiona Intro para continuar)");
        
        
        //Nivel 1
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n" +
        "sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el\n" +
        "computador tiene problemas para calcular parte de las coordenadas de salto.\n" +
        "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n" +
        "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
        "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
        "¿Qué debe introducir?");
        System.out.println("");
        System.out.println("");
        
        do {
            
        
        S1 = (int)(1+Math.random()*10);
        S2 = (int)(20+Math.random()*10);
        
        
        for (int i = S1; i < S2; i++) {
            suma+=i;
        }
        
        System.out.println("Haga el sumatorio de "+S1+" y de "+S2);
        System.out.println("Introduzca la respuesta");
        respuesta = sc.nextInt();
        
            System.out.println("");
        if (respuesta==suma) {
            System.out.println("Felicidades, pasas al siguiente nivel");
        } else {
            System.out.println("Has perdido");
            perder=true;
        }
            System.out.println("");
            
            
        //Nivel 3
        System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n" +
        "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n" +
        "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los N existentes se\n" +
        "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n" +
        "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n" +
        "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n" +
        "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n" +
        "(redondeando N hacia abajo), donde N es el nº de niveles”.\n" +
        "¿Cual es el nivel correcto?");
        
        
        N = (int)(50 + Math.random()*100);
        
            for (int i = 0; i < N; i++) {
                factorial*= cont;
                cont++;
            }
     
        System.out.println("Indique el factorial de "+N);
        System.out.println("Introduzca la respuesta");
        respuesta = sc.nextInt();           
            
            
            System.out.println("");
        if (respuesta==factorial) {
            System.out.println("Felicidades, pasas al siguiente nivel");
        } else {
            System.out.println("Has perdido");
            perder=true;
        }
            System.out.println("");        
        
        
        //Nivel 5   
        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n" +
        "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n" +
        "explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar\n" +
        "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n" +
        "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n" +
        "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n" +
        "el factorial de M y el factorial de S. ¿Qué valor debe introducir?");   
            
         M = (int)(5+Math.random()*10);
         S = (int)(5+Math.random()*10);
         
         suma=0;
         cont=1;
         
            for (int i = 0; i < M; i++) {
                fact1*=cont;
                cont++;
            }
            
         cont=1;
         
            for (int i = 0; i < S; i++) {
                fact2*=cont;
                cont++;
            }    
            
        System.out.println("Suma el factorial de "+M+" y "+S);
        System.out.println("Introduzca la respuesta");
        respuesta = sc.nextInt();           
            
            
        System.out.println("");
        if (respuesta==suma) {
            System.out.println("Felicidades, pasas al siguiente nivel");
        } else {
            System.out.println("Has perdido");
            perder=true;
        }
            System.out.println(""); 
            
        
        
        } while (perder);
        
        
        
    }//main
}//main
