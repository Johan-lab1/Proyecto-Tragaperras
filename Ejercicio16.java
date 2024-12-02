package activdad_6;

import java.util.Scanner;

public class Ejercicio16 {

	    public static void main(String[] args) {
	        // Crear el scanner para leer la entrada del usuario
	        Scanner sc = new Scanner(System.in);
	        
	        // Solicitar la edad del usuario
	        System.out.println("Ingrese su edad: ");
	        int edad = sc.nextInt();
	        
	        // Verificar si el usuario es mayor de edad
	        if (edad < 18) {
	            System.out.println("Eres menor de edad. Fin del programa.");
	            return; // Termina el programa si es menor de edad
	        }
	        
	        // Solicitar la apuesta
	        System.out.println("Ingrese la cantidad que desea apostar (entre 1 y 50 euros): ");
	        int apuesta = sc.nextInt();
	        
	        // Verificar que la apuesta esté en el rango válido
	        if (apuesta < 1 || apuesta > 50) {
	            System.out.println("Apuesta no válida. Fin del programa.");
	            return; // Termina el programa si la apuesta no es válida
	        }
	        
	        // Lanzar las tres ruletas (generar números aleatorios entre 1 y 4)
	        int ruleta1 = (int)(Math.random() * 4) + 1;
	        int ruleta2 = (int)(Math.random() * 4) + 1;
	        int ruleta3 = (int)(Math.random() * 4) + 1;
	        
	        // Mostrar los resultados de las ruletas
	        System.out.println("Resultados de las ruletas:");
	        System.out.println("Ruleta 1: " + ruleta1);
	        System.out.println("Ruleta 2: " + ruleta2);
	        System.out.println("Ruleta 3: " + ruleta3);
	        
	        // Comprobar cuántos números coinciden y calcular el premio
	        int premio = 0;
	        
	        if (ruleta1 == ruleta2 && ruleta2 == ruleta3) {
	            premio = apuesta * 3; // Tres coincidencias: premio triple
	            System.out.println("¡Felicidades! Los 3 números coinciden. ¡Has ganado el triple de tu apuesta!");
	        } else if (ruleta1 == ruleta2 || ruleta2 == ruleta3 || ruleta1 == ruleta3) {
	            premio = apuesta * 2; // Dos coincidencias: premio doble
	            System.out.println("¡Felicidades! 2 números coinciden. ¡Has ganado el doble de tu apuesta!");
	        } else {
	            System.out.println("No coincidieron los números. Has perdido tu apuesta.");
	        }
	        
	        // Mostrar el premio
	        if (premio > 0) {
	            System.out.println("Has ganado: " + premio + "€");
	        }
	        
	    }
	}
