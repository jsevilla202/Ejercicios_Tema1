package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Nombramos las variables "a", "b", "c", "x" e "y" como numeros con decimales
		double a, b, c, x, y;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca valores para las siguientes variables
		System.out.print("De la siguiente formula introduzca los valores de a, b, c y x: ");
		//Mostramos la formula de segundo grado
		System.out.println("ax^2+bx+c");
		//Pedimos al usuario que introduzca un valor para "a"
		System.out.print("Introduzca el valor de a: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "a"
		a = sc.nextDouble();
		//Pedimos al usuario que introduzca un valor para "b"
		System.out.print("Introduzca el valor de b: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "b"
		b = sc.nextDouble();
		//Pedimos al usuario que introduzca un valor para "c"
		System.out.print("Introduzca el valor de c: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "c"
		c = sc.nextDouble();
		//Pedimos al usuario que introduzca un valor para "x"
		System.out.print("Introduzca el valor de x: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "x"
		x = sc.nextDouble();
		//Igualamos la variable "y" a la formula de segundo grado
		y = (a*(x*x))+b*x+c;
		//Mostramos el resultado
		System.out.print("El valor de y es de "+y);
		//Cerramos el Scanner
		sc.close();
	}

}
