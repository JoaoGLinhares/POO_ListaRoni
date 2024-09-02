package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){

        Scanner leia = new Scanner(System.in);

        int ano_nascimento, ano_futuro = 2035, idade;

        System.out.println("Qual o ano do seu nascimento: ");
        ano_nascimento = leia.nextInt();

        idade = ano_futuro - ano_nascimento;

        System.out.println("Em 2035 você terá: "+idade);

        leia.close();

    }

}
