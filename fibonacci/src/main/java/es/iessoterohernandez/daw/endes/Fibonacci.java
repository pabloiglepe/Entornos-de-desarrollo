package es.iessoterohernandez.daw.endes;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Fibonacci {

	public static void fibonacci(int numero) {

		int primerNum = 0;
		int segundoNum = 1;
		int i, fibonacci;

		for (i = 0; i < numero; i++) {
			
			System.out.println(primerNum + " ");

			fibonacci = primerNum + segundoNum;
			primerNum = segundoNum;
			segundoNum = fibonacci;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numMaximo;

		System.out.print("Introduce cual quieres que sea el numero total de numeros de Fibonacci: ");
		numMaximo = sc.nextInt();

		System.out.println("\nSerie Fibonacci con " + numMaximo + " iteraciones: ");
		fibonacci(numMaximo);
	}
}
