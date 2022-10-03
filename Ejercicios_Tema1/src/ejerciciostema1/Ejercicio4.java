package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Nombramos las variables "base", "altura" y "area" como numeros con decimales
		double base, altura, area;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca la altura del triangulo
		System.out.print("Introduzca la altura de su triangulo porfavor: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "altura"
		altura = sc.nextDouble();
		//Pedimos al usuario que introduzca la base del triangulo
		System.out.print("Introduzca la base de su triangulo porfavor: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "base"
		base = sc.nextDouble();
		//Igualamos la variable "area" a la formula del area de un triangulo
		area = (base*altura)/2;
		//Mostramos el resultado
		System.out.print("Su area total es de "+area);
		//Cerramos el Scanner
		sc.close();

	}

}
