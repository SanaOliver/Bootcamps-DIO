package exercicios.estruturaderepeticao;
/*
Faça um programa que leia um conjunto de dois valores, o primeiro representando o nome do aluno
e o segundo a sua idade. Pare o programa quando for digitado 0 no nome do aluno.
 */

import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while (true){
            System.out.println("Nome:");
            nome = scan.next();
            if( nome.equals("0")) break;
            System.out.println("Idade:");
            idade = scan.nextInt();
        }
        System.out.println("Fim da Execucao!");
    }
}
