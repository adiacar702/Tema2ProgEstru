package ejercicios2_3Bucles;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		new Ejercicio_5().show();
	}

	public void show() {
		//		Ejercicio 5
		//		En el ejercicio anterior, ve mostrando al usuario la nota que ha introducido en cada
		//		iteración. Ejemplo:
		//		En la iteración 1 has introducido la nota 5
		//		¿cómo se llama la variable que has utilizado para mostrar cada iteración? R= i++
		int nota, i = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Indica una nota entre 0 y 10:\n");
			nota = keyboard.nextInt();
			i++;
			System.out.printf("En la iteración %d has indicado la nota %d\n", i, nota);
		} while (!(nota < 0 || nota > 10));

	}

}
