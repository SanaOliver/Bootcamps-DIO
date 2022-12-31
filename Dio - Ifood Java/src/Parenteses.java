import java.util.*;

public class Parenteses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        String pal = new String("true");
        if (palavra.isEmpty()) {
            System.out.println(pal);
        } else {
            String firstCharacter = palavra.substring(0, 1);
            String lastCharacter = palavra.substring(palavra.length() - 1);

            if (firstCharacter.equals(lastCharacter)) {
                System.out.println(pal);
            } else if (firstCharacter.equals("(") && lastCharacter.equals(")")) {
                System.out.println(pal);
            } else if (firstCharacter.equals("{") && lastCharacter.equals("}")) {
                System.out.println(pal);
            } else {
                pal = "false";
                System.out.println(pal);
            }

        }
    }

}
