
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pal = new String("TRUE");
        String palavra = sc.nextLine();
        String invertida = new StringBuffer(palavra).reverse().toString();
        if(palavra.equals(invertida)){
            System.out.println(pal);
        }else{
            pal = "FALSE";
            System.out.println(pal);
        }

    }
}
