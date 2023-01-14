/*Sua irmã está com o computador muito lento e pediu para você formata-lo.
 Mas ela gostaria muito de que todas as músicas dela fossem salvas e não deletadas com o resto dos arquivos
  durante a formatação. Todas as músicas estão no formato .mp3
Crie um programa que cada arquivo com esse formato não seja deletado.*/
import java.util.Scanner;
public class DeletarArquivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        String x2 = "mp3";
        String x = arquivoDoPc.substring(arquivoDoPc.length() - 3);
        if ( x.equals(x2)){
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }

    }
}
