package ejercicios2_3Bucles;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		new Ejercicio_4().show();
	}

	public void show() {
		//		Ejercicio 4
		//		Pídele al usuario que introduzca notas entre 0 y 10 hasta que 
		//		introduzca una nota no válida.
		int nota;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Indica una nota entre 0 y 10:\n");
			nota = keyboard.nextInt();
			System.out.printf("Has indicado la nota %d\n", nota);

		} while (!(nota < 0 || nota > 10));

	}
}