package PacoteJava;

import java.util.Scanner;

public class Exercicio8Aula1 {

	public static void main(String[] args) {
		
		double custoDeFabrica, custoDeDistribuicao, impostos, custoFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabrica: ");
		custoDeFabrica = leia.nextDouble();
		
		custoDeDistribuicao = (custoDeFabrica / 100) * 28;
		impostos = (custoDeFabrica / 100) * 45;
		custoFinal = (custoDeFabrica + custoDeDistribuicao + impostos);
		
		System.out.println("O custo final é: R$ " + custoFinal + " reais");
		

	}

}
