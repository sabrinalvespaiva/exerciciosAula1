package Lista2;

import java.util.*;

public class AtividadeIR {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		char OP;
		double salario;
		
		System.out.println("Qual seu nome?");
		nome = leia.next();
		
		System.out.println("Como prefere ser tratado? F (ELA), M (ELE), E (ELO)");
		OP = leia.next().charAt(0);
		
		System.out.println("Digite seu salario bruto: ");
		salario = leia.nextDouble();
		
		if(OP == 'F') {
			System.out.println("Olá, querida");
		} else if (OP == 'M') {
			System.out.println("Olá, querido");
		} else if (OP == 'E') {
			System.out.println("Olá, queride");
		}
		
		if(salario <= 2000) {
			System.out.println("Você esta isente do IR");	
		} else if(salario > 2000 && salario < 5000) {
			System.out.println("Você deve pagar 15% de IR, que será R$ " + salario + (salario / 100) * 15 );
		} else if(salario >= 5000) {
			System.out.println("Você deve pagar 25% de IR, que será R$ " + salario + (salario / 100) * 25);
		}
			
		
	}

}
