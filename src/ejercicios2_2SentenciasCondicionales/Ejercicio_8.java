package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		new Ejercicio_8().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		//		Ejercicio 8
		//		Realiza un programa que calcule el precio de un billete de ida y vuelta por avión,
		//		conociendo la distancia a recorrer, el número de días de estancia y sabiendo 
		//		que si la distancia es superior a 1.000 Km y el número de días de estancia 
		//		es superior a 7, la línea aérea le hace un descuento del 30 %. 
		//		El precio por kilómetro es de 0,35 €.

		Scanner keyboard = new Scanner(System.in);
		double km, precioSinDescuento, precioConDescuento;
		int days;
		double euros = 0.35;
		System.out.print("Especifique cuantos dias de Estancia:\n");
		days = keyboard.nextInt();
		System.out.print("Indique a que distancia esta de su destino:\n");
		km = keyboard.nextDouble();
		precioSinDescuento = ((km * 2) * euros);
		precioConDescuento = (precioSinDescuento - precioSinDescuento * 0.30);
		if ((km * 2 > 1000) && (days > 7)) {
			System.out.printf("Precio Ida y Vuelta con descuento es de: %.2f €\n", precioConDescuento);
		} else {
			System.out.printf("Coste de su billete de Ida y vuelta: %.2f €", precioSinDescuento);
		}

	}

}
