package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		new Ejercicio_5().show();
	}

	public void show() {
		//		Ejercicio 5
		//		Dada una nota, que te muestre lo siguiente: (hacerlo con anidación y con switch)
		//		0, 1, 2: Muy deficiente
		//		3, 4: Insuficiente
		//		5: Suficiente
		//		6: Bien
		//		7, 8: Notable
		//		9, 10: Sobresaliente
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int x;

		System.out.println("Indica la nota (0-10):\n");
		x = keyboard.nextInt();

		//ANIDADO
		if (x <= 2 && x >= 0) {
			System.out.println("Muy Deficiente");
		} else if (x == 3 || x == 4) {
			System.out.println("Insuficiente");
		} else if (x == 5) {
			System.out.println("Suficiente");
		} else if (x == 6) {
			System.out.println("Bien");
		} else if (x == 7 || x == 8) {
			System.out.println("Notable");
		} else if (x == 9 || x == 10) {
			System.out.println("Sobresaliente");
		}

		//SWITCH
		//		switch (x) {
		//		case 0:
		//		case 1:
		//		case 2:
		//			System.out.println("Muy Deficiente");
		//			break;
		//		case 3:
		//		case 4:
		//			System.out.println("Insuficiente");
		//			break;
		//		case 5:
		//			System.out.println("Suficiente");
		//			break;
		//		case 6:
		//			System.out.println("Bien");
		//			break;
		//		case 7:
		//		case 8:
		//			System.out.println("Notable");
		//			break;
		//		case 9:
		//		case 10:
		//			System.out.println("Sobresaliente");
		//			break;
		//		}
	}

}
