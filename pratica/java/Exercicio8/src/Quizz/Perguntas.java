package Quizz;

import java.util.Scanner;

public class Perguntas{
	
	private int escolha;
	private int acertou = 0;
	private int errou = 0;
	private String[] perguntas = new String[10];
	private Alternativas alternativas = new Alternativas();
	Respostas respostas = new Respostas();
	
	Scanner leitura = new Scanner(System.in);
	
	{
	perguntas[0] = "Qual ? o significado da sigla POO?";
	perguntas[1] = "O que siginifica 'int'?";
	perguntas[2] = "Qual palavra ? utilizada para instanciar uma classe?";
	perguntas[3] = "Quantos bits tem 1 byte?";
	perguntas[4] = "Qual ? a sigla para 'Java virtual machine'?";
	perguntas[5] = "Quantos bytes tem um 'char'?";
	perguntas[6] = "Quem ? considerado como o 'pai' do Java?";
	perguntas[7] = "Qual ? o 'simbolo' da linguagem java?";
	perguntas[8] = "Em rela??o a linguagem Java, a palavra 'Eclipse' se refere a:";
	perguntas[9] = "Qual o tipo de variavel que pode possuir os valores 'false' ou 'true'?";
	}

	
	public int getAcertou() {
		return acertou;
	}


	public int getErrou() {
		return errou;
	}

		
	public void perguntar() {
		for(int i = 0; i< perguntas.length ; i++) {
			System.out.println();
			System.out.println(perguntas[i]);
			System.out.println(alternativas.alternativa[i]);
			escolha = leitura.nextInt();
			if(respostas.resposta[i].equals(escolha)) {
				acertou++;
			}else
				errou++;			
			
		}
	}
	
}