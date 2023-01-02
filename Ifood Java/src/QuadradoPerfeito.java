import java.util.*;

public class QuadradoPerfeito {
    static void perfectSquares(int r)
{

    // For every element from the range
    for (int i = 1 ; i <= r; i++)
    {

        if (Math.sqrt(i) == (int)Math.sqrt(i))
            System.out.print(i + " ");
    }
}

    // Driver code
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        perfectSquares(r);
    }
}

