package Corpora��o;

public class Funcionario {
	
	private String nome;
	private double salario = 0;
	private double salarioLiquido = 0;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}


	public void ImprimirDados() {
		System.out.println("Funcion�rio " + this.nome + "\n" +
							"Sal�rio: " + this.salario);
		if(salario <2000) {
			this.salarioLiquido = salario + calcularBonificacao(salario);
			System.out.println("B�nus: " + calcularBonificacao(salario));
		}else {
			this.salarioLiquido = salario + calcularDesconto(salario);
			System.out.println("Desconto: " + calcularDesconto(salario));
		}		
			System.out.println("Sal�rio Liquido: " + this.salarioLiquido + "\n");
	}
	
	private double calcularBonificacao(double salario) {
		if(salario <= 1000)
			return salario*20/100;
		else
			return  salario*10/100;
		
	}
	
	private double calcularDesconto(double salario) {
		return salario*10/100;
	}
}
