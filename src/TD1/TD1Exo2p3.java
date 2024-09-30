package TD1;

import java.util.Scanner;

/**
 * TP1Exo2p3
 */
public class TD1Exo2p3 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double prixHT, TVA, prixTTC;
        int nbreArt;
        String librelleArt;

        System.out.print("Entrez le prix hors taxe: ");
        prixHT = scanner.nextDouble();

        System.out.print("Entrez la TVA: ");
        TVA = scanner.nextDouble();

        System.out.print("Entrez le nombres d'articles: ");
        nbreArt = scanner.nextInt();

        System.out.print("Entrez le libellé de l'article: ");
        librelleArt = scanner.nextLine();

        scanner.close();

        prixTTC = prixHT * (1 + TVA/100);
        prixTTC *= nbreArt;

        System.out.println(
            "\nLe prix total des " + nbreArt + " " + librelleArt + " est " + prixTTC + "f"
        );


    }
}