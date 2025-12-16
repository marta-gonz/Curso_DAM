/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ProyectoStarWars;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class proyectoStarWars {
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
        boolean perder=true;
        int nivel=1;
        int p1, p2;
        int producto;
        boolean esPrimo=true;
        int p = (int)(10+Math.random()*100);
       
        
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ==="); 
        
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n" +
        "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
        "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
        "está construyendo para destruirla. "+ 
        "(Presiona Intro para continuar)");
        sc.nextLine();
        
        do {
            
            switch (nivel) {
                case 1:
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




                    S1 = (int)(1+Math.random()*10);
                    S2 = (int)(20+Math.random()*10);


                    for (int i = S1; i < S2; i++) {
                        suma+=i;
                    }
                    System.out.println(suma);

                    System.out.println("Haga el sumatorio de "+S1+" y de "+S2);
                    System.out.println("Introduzca la respuesta");
                    respuesta = sc.nextInt();

                        System.out.println("");
                    if (respuesta==suma) {
                        System.out.println("Felicidades, pasas al siguiente nivel");
                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                        "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        perder=false;
                        break;
                    }
                        System.out.println("");
                case 2:
                    System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
                    "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n" +
                    "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n" +
                    "agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados\n" +
                    "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n" +
                    "“Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso\n" +
                    "para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n" +
                    "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n" +
                    "manual del piloto que estaba en la guantera y da con la página correcta. El código\n" +
                    "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                    "¿Cuál es el código?");
                    System.out.println("");
                    
                        p1 = (int)(1+Math.random()*7);
                        p2 = (int)(8+Math.random()*4);
                        
                        cont=p1+1;
                        producto = p1;
                        for (int i = p1; i < p2; i++) {
                            producto = producto*cont;
                            cont++;
                        }
                        System.out.println(producto);
                        
                        System.out.println("Haga el productorio de "+p1+" y de "+p2);
                        System.out.println("Introduzca la respuesta");
                        respuesta = sc.nextInt();

                            System.out.println("");
                        if (respuesta==producto) {
                            System.out.println("Felicidades, pasas al siguiente nivel");
                        } else {
                            System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                            "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                            perder=false;
                            break;
                        }
                            System.out.println("");
                    
                case 3:
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

                        cont=0;
                        for (int i = 1; i < N; i++) {
                            factorial*= cont;
                            cont++;
                        }
                        
                    System.out.println(factorial);
                    
                    System.out.println("Indique el factorial de "+N);
                    System.out.println("Introduzca la respuesta");
                    respuesta = sc.nextInt();           


                        System.out.println("");
                    if (respuesta==factorial) {
                        System.out.println("Felicidades, pasas al siguiente nivel");
                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                        "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        perder=true;
                        break;
                    }
                        System.out.println("");    
                        
                case 4:
                    
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n" +
                    "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n" +
                    "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n" +
                    "verificar si el número P es primo o no. Si es primo introduce un 1, si no lo es\n" +
                    "introduce un 0.");
                    
                    System.out.println("El numero es: " + p);
                    System.out.println("¿Es primo?(1/0)");
                    respuesta = sc.nextInt();
        
                    for (int i = 2; i < p; i++) {
                        if (p%i==0) {
                            esPrimo=false;
                        }
                    }
                    if (respuesta==1 && esPrimo) {
                        System.out.println("Correcto, es primo");
                    } else if (respuesta==0 && esPrimo==false){
                        System.out.println("Correcto, no es primo");
                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                        "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        perder = false;
                        break;
                    }
                    
                case 5:
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

                        suma = fact1 + fact2;
                        System.out.println(suma);
                        
                    
                    System.out.println("Suma el factorial de "+M+" y "+S);
                    System.out.println("Introduzca la respuesta");
                    respuesta = sc.nextInt();           


                    System.out.println("");
                    if (respuesta==suma) {
                        System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n" +
                        "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n" +
                        "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n" +
                        "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n" +
                        "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n" +
                        "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n" +
                        "imperio.\n" +
                        "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
                        perder=false;
                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                        "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        perder=false;
                        break;
                    }
                        System.out.println("");
         
            }//Switch

        } while (perder);
        
        System.out.println("Gracias por jugar :D");
    } //main
} //class
