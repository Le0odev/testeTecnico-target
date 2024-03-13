package questoes;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		int numero = solicitarNumero();
		
		int[] sequencia = calcularFibonacci(numero);
		
		boolean pertence = verificarPertence(sequencia, numero);
		
		if(pertence) {
			System.out.println(numero + "pertence a sequencia de Fibonacci");
		} else {
			System.out.println("Não pertence a sequencia de Fibonacci");
		}
		
		
	}
	
	public static int solicitarNumero() {
		
		Scanner scanner = new Scanner(System.in);
		scanner.close();
		
		System.out.println("Digite um número para verificar se pertence a sequencia de Fibonacci: ");
		int numero = scanner.nextInt();
		return numero;
		
		
		
	} 

	public static int[] calcularFibonacci(int numero) {
		
		int[] sequencia = new int[numero + 1];
		sequencia[0] = 0;
		sequencia[1] = 1;
		for ( int i = 2; i <= numero; i++) {
			
			sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
			
		}
		return sequencia;
		
		
		
	}
	
	public static boolean verificarPertence(int[] sequencia, int numero) {
			
		for ( int i = 0; i < sequencia.length; i++)
			if ( sequencia[i] == numero) {
				return true;
			}
			return false;
	}
	
	
}
