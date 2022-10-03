package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		////Nombramos las variables "s", "m" y "h" como numeros enteros
		int s,m,h;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca una cantidad de segundos
		System.out.print("Introduzca una cantidad de segundos para ser convertido en horas y minutos: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "s"
		s = sc.nextInt();
		//Igualamos la variable "m" a la conversión de segundos a minutos
		m = s/60;
		//Igualamos la variable "h" a la conversión de minutos a horas
		h = m/60;
		//Mostramos el resultado
		System.out.print("En esa cantidad de segundos hay un total de "+m+" minutos y "+h+" horas");
		//Cerramos el Scanner
		sc.close();
		
		

	}

}
