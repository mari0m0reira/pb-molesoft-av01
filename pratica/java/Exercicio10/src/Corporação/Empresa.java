package Corpora��o;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		
		int numeroDeFuncionarios;
		String nome;
		double salario;
		Funcionario[] funcionarios;		 
		Scanner leitura;        
		leitura = new Scanner(System.in);
		
		System.out.println("Digite o n�meros de funcionarios: ");
		numeroDeFuncionarios = leitura.nextInt();
		
		funcionarios = new Funcionario[numeroDeFuncionarios];
		
		//Realiza a leitura do nome e salario dos funcionarios
		for(int i = 0; i < numeroDeFuncionarios ; i++) {
			System.out.println("Digite o nome do funcionario " + (i+1) + ":");
			leitura.next();
			nome = leitura.nextLine();
			System.out.println("Digite o valor do sal�rio do funcionario " + i + ":");
			salario = leitura.nextDouble();
			funcionarios[i] = new Funcionario(nome , salario);
		}
		System.out.println();
		
		//Imprime na tela os dados dos funcionarios
		for(int i = 0 ; i < funcionarios.length ; i++) {
			funcionarios[i].ImprimirDados();	
		}
	}

}
