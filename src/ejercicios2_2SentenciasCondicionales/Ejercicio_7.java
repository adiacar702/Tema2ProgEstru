package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		new Ejercicio_7().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		//		Dados 3 números, muéstralos en orden ascendente. Puede ser que haya números
		//		iguales.
		Scanner keyboard = new Scanner(System.in);
		double x, y, z;

		System.out.println("indica 3 numeros:");
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		z = keyboard.nextDouble();

		if ((z <= y) && (y <= x)) {
			System.out.printf("%.1f %.1f %.1f", z, y, x);
		} else if ((y <= z) && (x <= y)) {
			System.out.printf("%.1f %.1f %.1f", x, y, z);
		} else if ((x <= z) && (z <= y)) {
			System.out.printf("%.1f %.1f %.1f", x, z, y);
		} else if ((y <= x) && (x <= z)) {
			System.out.printf("%.1f %.1f %.1f", y, x, z);
		} else if ((y <= z) && (z <= x)) {
			System.out.printf("%.1f %.1f %.1f", y, z, x);
		} else if ((x <= y) && (z <= x)) {
			System.out.printf("%.1f %.1f %.1f", z, x, y);
		}
	}
}
