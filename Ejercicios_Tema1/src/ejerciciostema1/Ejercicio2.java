package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero, resto, suma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el número que desee para saber cuantos numero le hacen falta "
				+ "para que sea multiplo de 7: ");
		
		numero = sc.nextInt();
		resto = (numero%7);
		suma = 7 - resto;
				
		System.out.print(resto==0 ? "Su número ya es multiplo de 7" : "Si a su número se le suma "
			+suma +" seía multiplo de 7");
		
		sc.close();
	}

}
