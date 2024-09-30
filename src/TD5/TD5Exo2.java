package TD5;

import java.util.Scanner;

public class TD5Exo2 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String txt;

        System.out.print("Entrez une phrase: ");
        txt = scanner.nextLine();

        scanner.close();

        System.out.println("Le nombre de caractères de \"" + txt + "\" est de: " + txt.length());

    }
}
