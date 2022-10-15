package Programas;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o número da tabuada");
		num = leia.nextInt();
		
		for(int i = 1; i<=10 ; i++) {
			
			int resultado = num*i;
			
			System.out.println(num + "*" +i+ " = " + resultado);
		}
		
		
	}

}
