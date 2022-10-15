package Programas;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int qtdNum, num;
		int count = 0;
		int qtdPares = 0;
		int qtdImpares = 0;
		
		System.out.println("Digite a quantidade de números: ");
		qtdNum = leia.nextInt()	;
		
		do {
			
			System.out.println("Digite o número: \n");
			num = leia.nextInt();
			
			count++;
			
			if(num % 2 == 0) qtdPares++;
			else qtdImpares++;
					
		} while(count<qtdNum);
		
		System.out.println("Pares: " + qtdPares);
		System.out.println("Ímpares: " + qtdImpares);
	}

}
