package Lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		int entrada1, entrada2, entrada3;
				
			
		System.out.println("Digite o primeiro valor: ");
		entrada1 = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		entrada2 = leia.nextInt();
		System.out.println("Digite o terceiro valor: ");
		entrada3 = leia.nextInt();
		
		if(entrada1 < entrada2) {
			 if(entrada2 < entrada3) {
				System.out.println("Os numeros em ordem crescente s�o " + entrada1 + entrada2 + entrada3);
			}
		} 
		if(entrada2 < entrada1) {
			if(entrada1 < entrada3) {
			System.out.println("Os numeros em ordem crescente s�o " + entrada2 + entrada1 + entrada3);
			}
		}
		 if(entrada3 < entrada1) {
			if(entrada1 < entrada2) {
			System.out.println("Os numeros em ordem crescente s�o " + entrada3 + entrada1 + entrada2);
			}
		}
		if(entrada3 < entrada2) {
			if(entrada2 < entrada1) {
				System.out.println("Os numeros em ordem crescente s�o " + entrada3 + entrada2 + entrada1);
			}
		}
		if(entrada1 < entrada3) {
			if(entrada3 < entrada2) {
				System.out.println("Os numeros em ordem crescente s�o " + entrada1 + entrada3 + entrada2);
			}
		}
		if(entrada2 < entrada3) {
			if(entrada3 < entrada1) {
				System.out.println("Os numeros em ordem crescente s�o " + entrada2 + entrada3 + entrada1);
			}
		}
		

	}
}
