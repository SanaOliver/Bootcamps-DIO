package exercicios.estruturaderepeticao;

import java.util.Scanner;

public class Nota {
    /*
    Faça um programa que receba uma nota entre 0 e 10.
    Mostre uma msg caso o valor seja invalido e continue pedindo ate obter um valor valido
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Insira uma nota entre 0 e 10:");
            nota = scan.nextInt();
            if (nota < 0 | nota > 10) System.out.println("Nota invalida!");

        } while (nota <0 ||  nota > 10);
    }
}
