package Lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner leia = new Scanner(System.in);
		int entrada1, entrada2, entrada3;
				
			
		System.out.println("Digite o primeiro valor: ");
		entrada1 = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		entrada2 = leia.nextInt();
		System.out.println("Digite o terceiro valor: ");
		entrada3 = leia.nextInt();
		
		if(entrada1 > entrada2) {
			System.out.println("O maior valor � " + entrada1);
		} else if(entrada2 > entrada3) {
			System.out.println("O maior valor � " + entrada2);
		} else if(entrada3 > entrada1) {
			System.out.println("O maior valor � " + entrada3);
		}
		
	

	}

}
