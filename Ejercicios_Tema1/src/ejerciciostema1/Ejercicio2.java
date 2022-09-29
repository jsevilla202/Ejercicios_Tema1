package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Nombramos las variables "numero", "resto" y "suma" como enteros
		int numero, resto, suma;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que inserte el numero que desee
		System.out.print("Inserte el número que desee para saber cuantos numero le hacen falta "
				+ "para que sea multiplo de 7: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextInt();
		//La variable "resto" es el resto de dividir entre 7
		resto = (numero%7);
		//La variable "suma" es lo que le falta al resto para llegar a 7 y ser un multiplo de 7
		suma = 7 - resto;
		/*Si es resto es 0, le dicimos al usuario que ya es múltiplo de 7 pero si no lo es
		le decimos cuanto la felta para serlo*/
		System.out.print(resto==0 ? "Su número ya es multiplo de 7" : "Si a su número se le suma "
			+suma +" seía multiplo de 7");
		//Cerramos el scanner
		sc.close();
	}

}
