import java.util.Scanner;
public class MesadadoSobrinho {
    // Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

    public static void main(String[] args) {
        int periodo;
        int mesada;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da mesada:");
        mesada = leitor.nextInt();
        System.out.print("Digite o periodo em meses:");
        periodo = leitor.nextInt();

        System.out.println(periodo*mesada);

        }

}
