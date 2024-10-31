package ejercicios2_3Bucles;

import java.util.Random;

public class Ejercicio_1 {

	public static void main(String[] args) {
		new Ejercicio_1().show();
	}

	public void show() {
		int number = 0;
		Random random = new Random();
		do {
			number = random.nextInt(1000) + 1;
			System.out.println(number);
		} while (!(number % 9 == 0));
	}
}
