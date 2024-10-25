package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		new Ejercicio_1().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		//		Ejercicio 1
		//		Dada una cantidad, si es mayor de 1000, que muestre el 15% de dicha cantidad. Si no,
		//		que no haga nada.
		Scanner keyboard = new Scanner(System.in);
		double x = 0;
		double result;

		System.out.println("Indica un número mayor o menor de 1000:\n");
		x = keyboard.nextDouble();

		if (x > 1000) {
			result = (x * 15) / 100;
			System.out.println(result);
		}
	}

}
