package ejercicios2_3Bucles;

import java.util.Scanner;

public class Ejerciciox_10 {

	public static void main(String[] args) {
		new Ejerciciox_10().show();
		//		Ejercicio 10
		//		Dados dos números enteros positivos, calcula su producto utilizando solo sumas.
	}

	@SuppressWarnings("resource")
	public void show() {

		Scanner keyboard = new Scanner(System.in);
		int numero1, numero2, producto = 0;
		int contador = 0;

		do {
			System.out.print("Ingresa el primer número entero positivo: ");
			numero1 = keyboard.nextInt();
		} while (numero1 <= 0);

		do {
			System.out.print("Ingresa el segundo número entero positivo: ");
			numero2 = keyboard.nextInt();
		} while (numero2 <= 0);

		do {
			producto += numero1;
			contador++;
		} while (contador < numero2);

		System.out.printf("El producto de %d y %d es: %d%n", numero1, numero2, producto);
	}

}
