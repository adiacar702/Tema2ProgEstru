package ejercicios2_3Bucles;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		new Ejercicio_6().show();
	}

	public void show() {
		//		Ejercicio 6
		//		En el ejercicio anterior, muestra el número de aprobados 
		//		en total y el número de suspensos en total. 
		//		¿cómo se llaman las variables que has utilizado para el número de
		//		aprobados y suspensos? R= suspensos++, aprobados++
		int nota, i = 0;
		int aprobados = 0, suspensos = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Indica una nota entre 0 y 10:\n");
			nota = keyboard.nextInt();
			i++;
			if (nota < 5 && nota >= 0) {
				suspensos++;
			} else if (nota >= 5 && nota <= 10) {
				aprobados++;
			}
			System.out.printf("En la iteración %d has indicado la nota %d\n", i, nota);
		} while (!(nota < 0 || nota > 10));
		System.out.printf("Aprobados: %d\n", aprobados);
		System.out.printf("Suspensos: %d", suspensos);
	}
}
