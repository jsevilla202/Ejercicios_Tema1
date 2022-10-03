package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Nombramos las variables "a" y "b"como numeros enteros
		int a, b;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca el valor del primer número
		System.out.print("Introduzca un valor para el primer número: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "a"
		a = sc.nextInt();
		//Pedimos al usuario que introduzca el valor del segundo número
		System.out.print("Introduzca un valor para el segundo número: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "b"
		b = sc.nextInt();
		//Si la variable "a" es igual a la variable "b" el resultado será true, en otro caso será false
		System.out.print(a==b? true : false);
		//Cerramos el Scanner
		sc.close();

	}

}
