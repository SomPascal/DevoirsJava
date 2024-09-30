package TD2;

import java.util.Scanner;

public class TD2Exo3p3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String nom1;
        String nom2;
        String nom3;

        System.out.println("Entrez le 1er nom: ");
        nom1 = scanner.nextLine();

        System.out.println("Entrez le 2e nom: ");
        nom2 = scanner.nextLine();

        System.out.println("Entrez le 3e nom: ");
        nom3 = scanner.nextLine();

        scanner.close();

        if (nom1.compareTo(nom2) <= 0 && nom2.compareTo(nom3) <= 0) 
        {
            System.out.println("Les noms sont dans l'ordre alphabétique.");
        } else {
            System.out.println("Les noms ne sont pas dans l'ordre alphabétique");
        }
    }
}
