package exercicios.arrays;
/*
Crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa
 */
import java.util.Scanner;
public class OrdemInversa {
    public static void main(String[] args) {/*
        int [] vetor = {0, -5, 15, 50, 8, 4};
        for (int i = 5; i=<0, i--){

        }
*/
        int A, N, cont, soma = 0;

        Scanner scan = new Scanner(System.in);
        A = scan.nextInt();
        N = scan.nextInt();
        cont = A;
        do{
            if(A % cont == 0) {
                soma = soma+cont;
                System.out.println(soma);
            }
            cont++;
        }while (N>=cont);
        System.out.println(soma);
    }
}
