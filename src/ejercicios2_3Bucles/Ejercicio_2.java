package ejercicios2_3Bucles;

import java.util.Random;

public class Ejercicio_2 {

	public static void main(String[] args) {
		new Ejercicio_1().show();
	}

	//	Ejercicio 2
	//	Modifica el ejercicio anterior para que el múltiplo de 9 sí se muestre.
	public void show() {
		int number = 0;
		Random random = new Random();
		do {
			number = random.nextInt(1000) + 1;
			System.out.println(number);
		} while (number % 9 == 0);
	}
}
