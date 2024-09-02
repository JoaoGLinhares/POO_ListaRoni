package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){

        Scanner leia = new Scanner (System.in);

        double C, F;

        System.out.print("Quantos graus celsius estão? ");
        C = leia.nextDouble();

        F = C * 1.8 + 32;

        System.out.print("°"+ C +" equivalem a: "+ F +" Fahrenheit");

        leia.close();

    }

}
