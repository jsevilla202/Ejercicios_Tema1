package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Nombramos las variables "mili", "cm" y "m" como numeros con decimales
		double mili, cm, m;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca una cantidad de milimetros
		System.out.print("Porfavor introduzca los siguientes datos requeridos:\n "
				+ "Introduzca una cantidad de milimetros: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "mili"
		mili = sc.nextDouble();
		//Pedimos al usuario que introduzca una cantidad de centímetros
		System.out.print(" Introduzca una cantidad de centimetros: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "cm"
		cm = sc.nextDouble();
		//Pedimos al usuario que introduzca una cantidad de metros
		System.out.print(" Introduzca una cantidad de metros: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "m"
		m = sc.nextDouble();
		//Igualamos la variable "mili" a la conversión de milimetros a centímetros
		mili = mili/10;
		//Igualamos la variable "m" a la conversión de metros a centímetros
		m = m*100;
		/*Igualamos la variable "mili" a la suma de los milimetros y metros convertidos en centímetros
		más los centímetros*/
		cm = mili+cm+m;
		//Mostramos el resultado
		System.out.print("La suma de esas cantidades en centimetros es de: "+ cm);
		//Cerramos el Scanner
		sc.close();
	}

}
