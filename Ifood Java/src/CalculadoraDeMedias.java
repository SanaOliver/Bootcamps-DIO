import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos =  {"Maria", "Daniela", "Sonia", "Heloisa"};
        int media = calculaMediaTurma(alunos, scan);
        System.out.printf("Media da turma %d", media);

    }
    public static int calculaMediaTurma(String[] alunos, Scanner scanner){
        int soma = 0;
        for (String aluno: alunos) {
            System.out.printf("Media do aluno %s", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
