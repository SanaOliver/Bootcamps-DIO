/*Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola.
Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes,
principalmente as crianças que estão muito acostumadas com a tecnologia,
poderiam colocar suas moedas e receber dois doces aleatórios.
 */
import java.util.Scanner;
public class LojinhaDeDoce {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float doce, credito;
        System.out.println("Qual o valor do doce?");
        doce = leitor.nextFloat();
        System.out.println("Quanto o cliente pagou?");
        credito = leitor.nextFloat();
        System.out.println("O cliente obteve " +(credito / doce) + " doces");

    }
}