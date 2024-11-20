package es.iessoterohernandez.daw.endes;

import java.util.Scanner;

/**
 * Hello world!
 */
public class FibonacciMain {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
    	int numero;
    	
    	System.out.print("Introduce cual quieres que sea el numero total de numeros de Fibonacci: ");
		numero = sc.nextInt();
    	
    	System.out.println("\nSerie Fibonacci con " + numero + " iteraciones: ");
    	Fibonacci.fibonacci(numero);
    	
    }


}
