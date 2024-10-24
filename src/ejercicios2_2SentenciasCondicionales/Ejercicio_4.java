package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		new Ejercicio_4().show();
	}

	public void show() {
		//		Ejercicio 4
		//		Dado un número entero, indicar si el número es positivo, negativo o cero.
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int x;

		System.out.println("Indica un numero:");
		x = keyboard.nextInt();

		if (x > 0) {
			System.out.println("Es positivo");
		} else if (x < 0) {
			System.out.println("Es negativo");
		} else {
			System.out.println("es 0");
		}
	}

}
