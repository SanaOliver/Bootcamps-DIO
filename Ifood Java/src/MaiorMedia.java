package exercicios.estruturaderepeticao;
/*
Faça um programa que leia 5 numero e informe o maior deles e a media;
 */

import java.util.Scanner;

public class MaiorMedia {



    public static void main(String[] args){

       /* int numero = 0;
        int maior = 0;
        float media = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um numero:");
            numero = scan.nextInt();
            if (i == 0) maior = numero;
            if (numero > maior) maior = numero;
            media = media + numero;
            }

        System.out.println("O maior valor digitado foi:"+maior);
        System.out.println("A media dos numeros eh:"+(media/5));
*/
        Scanner leitor = new Scanner(System.in);
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int X, cont = -1;
        X = leitor.nextInt();

        for (int i=0; i<elementos.length; i++){
            if (elementos[i] == X){
                System.out.println("Achei "+X+" na posicao "+i);
                cont = i;
            }
        }
        if (cont == -1) {
            System.out.println("Numero "+X+" nao encontrado");
        }
    }
    }
