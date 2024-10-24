package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		new Ejercicio_2().show();
	}

	public void show() {
		//		Ejercicio 2
		//		Dado un número, indicar si es par o impar.
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		double x;

		System.out.println("Indica un numero:\n");
		x = keyboard.nextDouble();

		if (x % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
	}

}
