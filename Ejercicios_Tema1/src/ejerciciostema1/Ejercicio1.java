package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Nombramos la variable "numero" como double para obtener los decimales
		double numero;
		//Creamos el scanner llamado "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que inserte el numero con decimales
		System.out.print("Inserte un número con decimales que quiera redondear al numero entero "
				+ "más proximo: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextDouble();
		/*Truncamos el numero con (int) pero se le suman decimales dependiendo de lo buenos
		que seamos al corregir Ej. si subimos a partir de un 0.4 se le añade 0.6 al numero
		introducido*/ 
		System.out.print((int)(numero+0.5));
		//Cerramos el scanner
		sc.close();
	}

}
