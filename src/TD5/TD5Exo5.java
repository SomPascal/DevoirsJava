package TD5;

import java.util.Scanner;

public class TD5Exo5 
{
    public static void main(String[] args) 
    {
        String phrase;
        String res = "";
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une phrase: ");
        phrase = scanner.nextLine();

        System.out.print("Entrez le numéro du caractère à retirer: ");
        n = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < phrase.length(); i++) 
        {
            if (i + 1 != n) 
            {
                res += phrase.charAt(i);
            }
        }

        System.out.println("La nouvelle phrase est: ");
        System.out.println(res);
    }
}
