package ejercicios2_3Bucles;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		new Ejercicio_9().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		//		Ejercicio 9
		//		Crea un programa que muestre un menú con tres opciones:
		//		1. Sumar dos números
		//		2. Restar dos números
		//		3. Salir
		//		El programa debe ejecutarse hasta que el usuario elija la opción de salir. En las
		//		opciones 1 y 2, los números a operar se le piden al usuario.

		Scanner keyboard = new Scanner(System.in);
		int opcion = 0, num1, num2, total;

		do {
			System.out.println("--------------------------------");
			System.out.println("|    Selecciona una opción     |");
			System.out.println("--------------------------------");
			System.out.println("| 1 SUMAR | 2 RESTAR | 3 SALIR |");
			System.out.println("--------------------------------");
			opcion = keyboard.nextInt();
			if (opcion == 1) {
				System.out.println("Indica los numeros para sumarlos:\n");
				num1 = keyboard.nextInt();
				num2 = keyboard.nextInt();
				total = num1 + num2;
				System.out.printf("La suma de ambos números es: %d\n", total);
			} else if (opcion == 2) {
				System.out.println("Indica los numeros para restarlos:\n");
				num1 = keyboard.nextInt();
				num2 = keyboard.nextInt();
				total = num1 - num2;
				System.out.printf("La resta de ambos números es: %d\n", total);
			} else if (opcion == 3) {
				System.out.println("Programa Finalizado\n");
				break;
			}
		} while (!(opcion < 1 || opcion > 3));

	}
}
