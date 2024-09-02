package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){

        Scanner leia = new Scanner (System.in);

        int hrtbr = 0, hrext = 0, total1, total2;

        System.out.print("Quantas horas foram trabalhadas esse ano? ");
        hrtbr = leia.nextInt();

        System.out.print("Quantas horas extras foram trabalhadas esse ano? ");
        hrext = leia.nextInt();

        total1 = hrtbr * 10;
        total2 = hrext * 15;

        System.err.print("O salarido desse ano foi R$"+ (total1 + total2));

        leia.close();


    }

}
