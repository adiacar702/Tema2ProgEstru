package ejercicios2_3Bucles;

import java.util.Scanner;

public class Ejercicio_7 {
	public static void main(String[] args) {
		new Ejercicio_7().show();
	}

	public void show() {
		//		Ejercicio 7
		//		En el ejercicio anterior, muestra la nota media de los aprobados y 
		//		la nota media de los suspensos. ¿cómo se llaman las variables que has 
		//		utilizado para las notas medias?
		int nota, i = 0;
		Integer sumapro = 0, sumsus = 0;
		int aprobados = 0, suspensos = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Indica una nota entre 0 y 10:\n");
			nota = keyboard.nextInt();
			i++;
			if (nota < 5 && nota >= 0) {
				suspensos++;
				sumsus += nota;
			} else if (nota >= 5 && nota <= 10) {
				aprobados++;
				sumapro += nota;
			}
			System.out.printf("En la iteración %d has indicado la nota %d\n", i, nota);
		} while (!(nota < 0 || nota > 10));
		System.out.printf("Aprobados: %d\n - MEDIA: %d\n", aprobados, sumapro / aprobados);
		System.out.printf("Suspensos: %d\n - MEDIA: %d", suspensos, sumsus / suspensos);
	}
}
