package ejercicios2_3Bucles;

import java.util.Scanner;

public class Ejerciciox_12 {

	public static void main(String[] args) {
		new Ejerciciox_12().show();
		//		Ejercicio 12
		//		Utilizando un bucle for con dos variables, realiza un programa que dados dos números
		//		enteros positivos n1 y n2 que se introducen por teclado y que cumplan que n1<n2, vaya
		//		aumentando n1 al doble de su valor y disminuyendo n2 a la mitad de su valor hasta que
		//		n1>n2.
	}

	@SuppressWarnings("resource")
	public void show() {

		Scanner keyboard = new Scanner(System.in);
		int n1, n2;

		// Solicitar n1 y n2 asegurando que n1 < n2
		do {
			System.out.print("Ingresa el primer número entero positivo (n1): ");
			n1 = keyboard.nextInt();
			System.out.print("Ingresa el segundo número entero positivo (n2): ");
			n2 = keyboard.nextInt();
		} while (n1 <= 0 || n2 <= 0 || n1 >= n2);

		// Aumentar n1 y disminuir n2
		for (; n1 <= n2; n1 *= 2, n2 /= 2) {
			System.out.printf("n1: %d, n2: %d%n", n1, n2);
		}
		System.out.printf("Resultado final: n1: %d, n2: %d - n1 es ahora mayor que n2.", n1, n2);

	}
}
