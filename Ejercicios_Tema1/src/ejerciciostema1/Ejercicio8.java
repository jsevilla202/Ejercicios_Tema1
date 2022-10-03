package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Nombramos las variables "infantiles" y "adultas" como numeros enteros
		int infantiles, adultas;
		//Nombramos las variables "total", "totaldescuento" como numeros con decimales
		double total, totaldescuento;
		//Nombramos las variables "descuento" y "precioinfantil" como numero con decimales constante
		final double descuento = 0.05;
		final double precioinfantil = 15.5;
		//Nombramos la variable "precioadulta" como numero entero constante
		final int precioadulta = 20;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca el numero de entradas infantiles vendidas
		System.out.print("¿Cuantas entradas infantiles han sido vendidas?: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "infantiles"
		infantiles = sc.nextInt();
		//Pedimos al usuario que introduzca el numero de entradas adultas vendidas
		System.out.print("¿Cuantas entradas adultan han sido vendidas?: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "adultas"
		adultas = sc.nextInt();
		/*Igualamos la variable "total" a la suma del numero de las diferentes entradas multiplicadas
		 por sus respectivos precios*/
		total = infantiles*precioinfantil+adultas*precioadulta;
		//Igualamos la variable "totaldescuento" al precio total menos el descuento aplicado
		totaldescuento = total - total*descuento;
		/*Si el precio total es inferior a 100 no se aplicara el descuento, en cambio si es igual
		 o mayor si se aplicara*/
		System.out.print(total<100? "El importe total es de "+total : "El importe total con el"
			+ " descuento aplicado es de "+totaldescuento);
		//Cerramos el Scanner
		sc.close();

	}

}
