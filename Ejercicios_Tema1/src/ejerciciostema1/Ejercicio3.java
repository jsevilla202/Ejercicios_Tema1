package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Nombramos las variables "numero", "resto", "suma" y "num2" como enteros
		int num1, resto, suma, num2, division;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		/*Pedimos al usuario que inserte el numero que desee para buscar el mutiplo más cercano a
		num2*/
		System.out.print("Inserte el número que desee para saber cuantos numero le hacen falta "
				+ "para que sea multiplo del siguiente: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "num1"
		num1 = sc.nextInt();
		//Pedimos al usuario que inserte el numero que desee
		System.out.print("Inserte el número que desee para obterner el multiplo más cercano: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "num2"
		num2= sc.nextInt();
		//La variable "resto" es el resto de dividir entre num2
		resto = (num1%num2);
		//Dividimos num1 entre num2
		division = (num1/num2);
		/*La variable "suma" es lo que le falta al resto para llegar aun multiplo de num2
		para obtenerla multiplicamos num2 por el resultado de la división más uno 
		para sacar el siguiente multiplo y le restamos num1*/
		suma = (num2*(division+1))-num1;
		/*Si es resto es 0, le dicimos al usuario que ya es múltiplo de num2 pero si no lo es
		le decimos cuanto la felta para serlo*/
		System.out.print(resto==0 ? "Su número ya es multiplo de " + num2 : "Si a "+num1 +
		" se le suma " +suma +" sería multiplo de "+num2);
		//Cerramos el scanner
		sc.close();

	}

}
