package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Nombramos las variables "metros" como numero con decimales
		double metros;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca los metros recorridos por el papel en metros
		System.out.print("¿Cuantos metros ha recorrido el papel?: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "metros"
		metros = sc.nextDouble();
		//Igualamos la variable "metros" a su conversión en centímetros
		metros = metros*100;
		//Mostramos el resultado en centímetros y truncando el valor de la variable "metros"
		System.out.print("El papel ha recorrido una distancia de "+ (int)metros+" centimetros");
		//Cerramos el Scanner
		sc.close();
		

	}

}
