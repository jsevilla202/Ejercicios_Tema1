package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		double numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte un número con decimales que quiera redondear al numero entero "
				+ "más proximo: ");
		numero = sc.nextDouble();

		System.out.print((int)numero);
	}

}
