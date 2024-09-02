package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao(){

        Scanner leia = new Scanner (System.in);

        int area, precom, largura, comprimento, preco;

        System.out.print("Qual o comprimento do terreno: ");
        comprimento = leia.nextInt();
        System.out.print("Qual a largura do terreno: ");
        largura = leia.nextInt();

        area = comprimento * largura;

        System.out.print("Qual o preço do metro quadrado? ");
        precom = leia.nextInt();

        preco = area * precom;

        System.out.print("A area é de: "+ area+ "m"+ " e o preço é: R$"+ preco);

        leia.close();

    }

}
