package ejercicios2_2SentenciasCondicionales;

import java.util.*;

public class Ejercicio_9 {

	public static void main(String[] args) {
		new Ejercicio_9().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		//		Ejercicio 9
		//		Dada una cadena, elige aleatoriamente una posición de dicha cadena. Muestra el
		//		carácter que se encuentra en dicha posición.
		Random posicion = new Random();
		Scanner keyboard = new Scanner(System.in);
		String cadena;
		int result;
		char cadenaC;
		System.out.println("Introduce una frase:\n");
		cadena = keyboard.nextLine();
		result = posicion.nextInt(cadena.length());
		cadenaC = cadena.charAt(result);

		System.out.printf("el character indicado esta en la posición:\n %d\n", result + 1);
		System.out.printf("el character de la posición indicada aleatoriamente es:\n %c", cadenaC);
	}
}
