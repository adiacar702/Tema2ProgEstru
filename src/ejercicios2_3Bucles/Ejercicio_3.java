package ejercicios2_3Bucles;

import java.util.Random;

public class Ejercicio_3 {

	public static void main(String[] args) {
		new Ejercicio_3().show();
	}

	//	Ejercicio 3
	//	Modifica el ejercicio anterior para que solamente haya 7 posibilidades para encontrar el
	//	múltiplo de 9. ¿cómo se llama la variable que has utilizado para las 7 posibilidades?
	public void show() {
		boolean exit;
		int number = 0, i = 0;
		Random random = new Random();
		do {
			number = random.nextInt(1000) + 1;
			System.out.println(number);
			exit = (number % 9 == 0);
			i++;
		} while ((!exit) && (i < 7));
	}

}
