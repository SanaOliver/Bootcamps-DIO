/*No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, escolheu todas as pessoas
que estavam na posição impar da fila para entrarem no camarote. Ele fez isso em diversos shows e as pessoas
foram a loucura para competirem por essas posições. Você resolveu criar um programa para saber, de acordo com o
número de pessoas na fila, quantas entrariam no camarote. */
import java.util.Scanner;
public class CamarotedoBlue {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        if (tamanhoDaFila % 2 == 0){
            tamanhoDaFila = tamanhoDaFila/2;
            System.out.println(tamanhoDaFila+" pessoas no camarote");
        }else {
            tamanhoDaFila = (tamanhoDaFila/2)+1;
            System.out.println(tamanhoDaFila+" pessoas no camarote");

        }
    }
}
