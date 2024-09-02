package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao(){

        int n1;

        System.out.println("Digite um número: ");
        Scanner leia = new Scanner(System.in);

        n1 = leia.nextInt();

        System.out.println("O antecessor de "+n1+" é: "+(n1-1)+" e o sucessor é: "+(n1+1));

        leia.close();

    }

}
