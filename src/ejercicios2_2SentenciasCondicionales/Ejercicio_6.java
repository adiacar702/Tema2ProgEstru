package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		new Ejercicio_6().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		//		Dados tres números, indicar cuántos son iguales. 
		//		Por ejemplo: Si la entrada fuese 5 5 5,
		//		la salida debería ser 
		//		Hay tres números iguales a 5 . 
		//		Si la entrada fuese 4 6 4, la salida debería ser 
		//		Hay dos números iguales a 4 . 
		//		Si la entrada fuese 0 1 2, la salida debería ser 
		//		No hay números iguales .
		Scanner keyboard = new Scanner(System.in);
		double x, y, z;

		System.out.println("indica 3 numeros:");
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		z = keyboard.nextDouble();

		if (x == y && x == z) {
			System.out.printf("Hay tres numeros iguales de %f", x);
		} else if (x == y && x != z) {
			System.out.printf("Hay dos numeros iguales a %f", x);
		} else if (y == z && y != x) {
			System.out.printf("Hay dos numeros iguales a %f", y);
		} else if (z == x && z != y) {
			System.out.printf("Hay dos numeros iguales a %f", z);
		} else {
			System.out.println("No hay numeros iguales");
		}
	}
}
