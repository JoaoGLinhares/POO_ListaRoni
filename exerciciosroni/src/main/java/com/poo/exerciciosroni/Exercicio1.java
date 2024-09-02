package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao(){

		int n1; 											//variavel inteira 1
		int n2; 											//variavel inteira 2

		System.out.print("Digite o primeiro numero: ");	     //Aqui é o "escreva"

		// Classe objeto
		Scanner leia = new Scanner(System.in);			 //Aqui cria o scanner
		n1 = leia.nextInt();   							 //Aqui é o "leia"

		System.out.print("O primeiro numero é: "+n1+"\n");

		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();

		System.out.println("O segundo numero é: "+n2);

		System.out.println("A soma é: "+(n1+n2));

		leia.close();




	}

}
