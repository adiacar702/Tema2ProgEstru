package ejercicios2_3Bucles;

import java.util.Scanner;

public class Ejerciciox_11 {

	public static void main(String[] args) {
		new Ejerciciox_11().show();
		//		Ejercicio 11
		//		Realiza un programa que calcule la suma de los pares y de los impares comprendidos
		//		entre dos valores enteros n1 y n2 que se introducen por teclado y que cumplan que
		//		n1<n2.
	}

	@SuppressWarnings("resource")
	public void show() {

		Scanner keyboard = new Scanner(System.in);
		int n1, n2;
		int sumaPares = 0;
		int sumaImpares = 0;
		// Solicitar n1 y n2 asegurando que n1 < n2
		do {
			System.out.print("Ingresa el primer número (n1): ");
			n1 = keyboard.nextInt();
			System.out.print("Ingresa el segundo número (n2): ");
			n2 = keyboard.nextInt();
		} while (n1 >= n2);

		int i = n1;
		// Calcular las sumas de pares e impares
		do {
			if (i % 2 == 0) {
				sumaPares += i; // Sumar si es par
			} else {
				sumaImpares += i; // Sumar si es impar
			}
			i++; // Incrementar i
		} while (i <= n2);
		System.out.printf("La suma de los números pares entre %d y %d es: %d%n", n1, n2, sumaPares);
		System.out.printf("La suma de los números impares entre %d y %d es: %d%n", n1, n2, sumaImpares);
	}

}