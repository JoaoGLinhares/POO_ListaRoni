package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio9 {
    public static void resolucao(){

        Scanner leia = new Scanner (System.in);

        int km, litro, consumo;

        System.out.print("Quantos km foram rodados? ");
        km = leia.nextInt();
        System.out.print("Quantos litros tinham? ");
        litro = leia.nextInt();

        consumo = km/litro;

        System.out.print("O consumo médio é de: "+ consumo+ "km/l");

        leia.close();

    }

}
