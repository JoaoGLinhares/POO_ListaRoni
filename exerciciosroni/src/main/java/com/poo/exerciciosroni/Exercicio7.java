package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){

        Scanner leia = new Scanner (System.in);

        int n1, n2;

        System.out.print("Escreva um numero: ");
        n1 = leia.nextInt();
        System.out.print("Escreva outro numero: ");
        n2 = leia.nextInt();

        System.out.println("Dividendo: "+ n1);
        System.out.println("Divisor: "+ n2);
        System.out.println("Quociente: "+ n1/n2);
        System.out.println("Resto: "+ n1%n2);

        leia.close();


    }

}
