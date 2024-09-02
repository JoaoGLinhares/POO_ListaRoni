package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio10 {
    public static void resolucao(){

        Scanner leia = new Scanner (System.in);

        int tempoTotal, horas, minutos, segundos;

        System.out.print("Digite o tempo em segundos: ");
        tempoTotal = leia.nextInt();

        horas = tempoTotal/3600;
        
        tempoTotal = tempoTotal%3600;

        minutos = tempoTotal/60;

        segundos = tempoTotal%60;

        System.out.print("Hora: "+ horas+ ", Minutos: "+ minutos+ ", Segundos: "+ segundos);

        leia.close();

        
    }

}
