package Lista2;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		//Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		//ímpar exiba o número elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite um valor: ");
		numero = leia.nextDouble();
		
		if(numero < 0) {
			System.out.println("Numero negativo, impossivel calcular");	
		}
		else if (numero == 0) {
			System.out.println("Zero é neutro, digite um numero positivo");
		}
		else if(numero % 2 == 0) {
			System.out.println("O numero é par e sua raiz quadrada é: " + Math.sqrt(numero));
		} else if (numero % 2 == 1) {
			System.out.println("O numero é impar e elevado ao quadrado é " + Math.pow(numero, 2));
		}
		
		
		
	}

}
