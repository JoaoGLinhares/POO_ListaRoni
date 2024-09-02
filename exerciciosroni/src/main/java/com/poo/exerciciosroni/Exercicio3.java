package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao(){

        Scanner leia = new Scanner(System.in);
        
        String nome;
        double n1, n2, n3, n4;
        
        System.out.println("Qual o nome do aluno: ");
        nome = leia.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = leia.nextDouble();
        System.out.println("Digite a quarta nota: ");
        n4 = leia.nextDouble();
        
        double media = (n1 + n2 + n3 + n4) / 4;
        
        System.out.println("A média foi: " + media);

        leia.close();


    }

}
