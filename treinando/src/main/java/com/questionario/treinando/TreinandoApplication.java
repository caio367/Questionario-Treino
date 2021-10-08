package com.questionario.treinando;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreinandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreinandoApplication.class, args);

		String start;
		int questCorretas = 0;

		List<Questionario> listaPerg = new ArrayList<Questionario>();

		Questionario p1 = new Questionario();
		p1.setPergunta("Qual é o tipo de atributo que recebe palavras? ");
		p1.setAltA("Int");
		p1.setAltB("Boolean");
		p1.setAltC("String");
		p1.setAltD("Double");
		p1.setAltCorreta("C");
		p1.setNquest(1);
		listaPerg.add(p1);

		Questionario p2 = new Questionario();
		p2.setPergunta("Qual dessas linguagens é mais antiga? ");
		p2.setAltA("Python");
		p2.setAltB("Java");
		p2.setAltC("C Sharp (C#)");
		p2.setAltD("Java Script");
		p2.setAltCorreta("A");
		p2.setNquest(2);
		listaPerg.add(p2);

		Scanner entrada = new Scanner(System.in);

		Questionario playerGenerico = new Questionario();

		System.out.println("Bem vindo ao ambiente virtual de testes!");
		System.out.println("---------------------------");
		System.out.println("Temos questõs de programação...");
		System.out.printf("Deseja responder as perguntas? \nDigite 'S' para SIM e 'N' para NÂO: ");
		start = entrada.next();

		Boolean resposta;
		// String newListPerg = String.valueOf(listaPerg);

		int i = 0;

		if (start == "S" || start == "s");
		{
			for (i = 0; i < listaPerg.size(); i++)
				listaPerg.get(i).Escreva();
			resposta = playerGenerico.VerificarResp(entrada.next());

			if (resposta) {
				questCorretas++;
			}
			System.out.println("Respostas corretas: " + questCorretas);

			// Questionario qst = new Questionario(listaPerg(i));

			entrada.close();
		}
	}
}