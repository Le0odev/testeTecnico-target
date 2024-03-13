package questoes;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite uma string para inverter: ");
		String texto = scanner.nextLine();
		
		String textoInvertido = inverterString(texto);		
		
		System.out.println("String invertida:" + textoInvertido);
		
		scanner.close();
	}
	
	public static String inverterString(String texto) {
		
		String textoInvertido = "";
		
		for (int i = texto.length() - 1; i >= 0; i--) {
			textoInvertido += texto.charAt(i);
			
		}
		return textoInvertido;
	}
	
}
