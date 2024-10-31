package ejercicios2_3Bucles;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		new Ejercicio_8().show();
	}

	public void show() {
		//		Ejercicio 8
		//		Un cajero automático necesita validar el PIN del usuario. 
		//		El usuario tiene hasta 3 intentos. 
		//		Hay que mostrar los intentos restantes en cada intento.
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int intentos = 3;
		Integer pin;
		int number = 1224;
		do {
			System.out.println("Indique su codigo PIN:\n");
			pin = keyboard.nextInt();
			if (pin.equals(number)) {
				System.out.println("PIN CORRECTO");
			} else {
				intentos--;
				System.out.printf("PIN INCORRECTO - quedan %d intentos\n", intentos);
			}

		} while (!(pin.equals(number)) && (intentos <= 3));

	}

}
