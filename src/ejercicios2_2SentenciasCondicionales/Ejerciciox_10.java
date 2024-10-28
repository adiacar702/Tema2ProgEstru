package ejercicios2_2SentenciasCondicionales;

import java.util.Random;

public class Ejerciciox_10 {

	public static void main(String[] args) {
		new Ejerciciox_10().show();
	}

	public void show() {
		//		Ejercicio 10
		//		Realiza un programa que saque una carta aleatoria de una baraja con 4 palos y 13
		//		cartas por cada palo. Los palos son Picas ♠, Corazones ♥, Diamantes ♦ y Tréboles ♣.
		//		Las	13 cartas por cada palo irán del as al diez y 
		//		además tres figuras: jota, reina y rey.
		//		Mostrar la carta incluyendo el símbolo del palo(♠,♥,♦,♣).
		Random baraja = new Random();
		Integer randomPalo = baraja.nextInt(4);
		Integer randomCarta = baraja.nextInt(13);
		String palo = "", carta = "";

		switch (randomPalo) {
		case 0 -> palo = "♠";
		case 1 -> palo = "♥";
		case 2 -> palo = "♦";
		case 3 -> palo = "♣";
		}

		switch (randomCarta) {
		case 0 -> carta = "As";
		case 1 -> carta = "2";
		case 2 -> carta = "3";
		case 3 -> carta = "4";
		case 4 -> carta = "5";
		case 5 -> carta = "6";
		case 6 -> carta = "7";
		case 7 -> carta = "8";
		case 8 -> carta = "9";
		case 9 -> carta = "10";
		case 10 -> carta = "Jota";
		case 11 -> carta = "Reina";
		case 12 -> carta = "Rey";
		}

		System.out.printf("%s %s", palo, carta);

	}
}
