package TD5;

import java.util.Scanner;

public class TD5Exo4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String phrase;

        System.out.print("Entrez une phrase: ");
        phrase = scanner.nextLine();

        scanner.close();

        System.out.println("Votre phrase a " + numVoyelles(phrase) + " voyelle(s)");
    }

    public static int numVoyelles(String phrase)
    {
        String voyelles = "aeuioy";
        int numVoyelles = 0;

        for (int i = 0; i < phrase.length(); i++) 
        {
            if (voyelles.indexOf(phrase.toLowerCase().charAt(i)) != -1) 
            {
                numVoyelles += 1;
            }
        }

        return numVoyelles;
    }
}
