package Lista2;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		//�mpar exiba o n�mero elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite um valor: ");
		numero = leia.nextDouble();
		
		if(numero < 0) {
			System.out.println("Numero negativo, impossivel calcular");	
		}
		else if (numero == 0) {
			System.out.println("Zero � neutro, digite um numero positivo");
		}
		else if(numero % 2 == 0) {
			System.out.println("O numero � par e sua raiz quadrada �: " + Math.sqrt(numero));
		} else if (numero % 2 == 1) {
			System.out.println("O numero � impar e elevado ao quadrado � " + Math.pow(numero, 2));
		}
		
		
		
	}

}
