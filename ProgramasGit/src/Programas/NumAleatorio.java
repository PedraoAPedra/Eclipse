package Programas;

import java.util.Random;

public class NumAleatorio {

	public static void main(String[] args) {
		
		Random random = new Random ();
		
		int[] numAleatorio = new int[20];
		
		for(int i = 0; i < numAleatorio.length; i++) {
			int numero = random.nextInt(100);
			numAleatorio[i] = numero;
			
		}
		
		System.out.println("Números aleatórios: ");
		for(int numero: numAleatorio) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nSucessores números aleatórios: ");
		for(int numero: numAleatorio) {
			System.out.print((numero+1 + " "));
		}
		
		System.out.println("\nAntecessor números aleatórios: ");
		for(int numero: numAleatorio) {
			System.out.print((numero-1 + " "));
		
	}

}
}