package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		new Ejercicio_3().show();
	}

	public void show() {
		//		Ejercicio 3
		//		Dados dos números, indicar si el primero es múltiplo del segundo. Un número x es
		//		múltiplo de y, si al dividir x entre y, el resto es 0.
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int x, y;

		System.out.println("Indica dos numeros: el primero debe ser mayor que el segundo");
		x = keyboard.nextInt();
		y = keyboard.nextInt();

		if (x % y == 0) {
			System.out.printf("%d es multiplo de %d", x, y);
		} else {
			System.out.printf("%d no es multiplo de %d", x, y);
		}

	}

}
