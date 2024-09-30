package TD5;

import java.util.Scanner;

public class TD5Exo3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String phrase;

        System.out.print("Entrez une phrase: ");
        phrase = scanner.nextLine();

        scanner.close();

        System.out.println("Cette phrase a " + phrase.split(" ").length + " de mots.");
    }
}
