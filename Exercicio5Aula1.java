package PacoteJava;

import java.util.Scanner;

public class Exercicio5Aula1 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		
		nota1 = nota1 * 2;
		nota2 = nota2 * 3;
		nota3 = nota3 * 5;
		media = (nota1 + nota2 + nota3) / 10;
		
		System.out.println("A media das notas é: " + media);
		

	}

}
