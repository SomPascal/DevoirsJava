package TD3;

import java.util.Scanner;

public class TD3Exo4p8
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des données
        System.out.print("Entrez le jour : ");
        int jour = scanner.nextInt();

        System.out.print("Entrez le mois : ");
        int mois = scanner.nextInt();

        System.out.print("Entrez l'année : ");
        int annee = scanner.nextInt();

        // Variable pour stocker le nombre de jours du mois
        int joursDuMois = 0;

        // Vérification si l'année est bissextile
        boolean estBissextile = (annee % 400 == 0) || (annee % 100 != 0 && annee % 4 == 0);

        // Vérification du mois et attribution du nombre de jours
        switch (mois) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                joursDuMois = 31;
                break;
            case 4: case 6: case 9: case 11:
                joursDuMois = 30;
                break;
            case 2:
                joursDuMois = (estBissextile) ? 29 : 28;
                break;
            default:
                System.out.println("Date invalide (mois incorrect)");
                scanner.close();
                return; // Terminer le programme si le mois est invalide
        }

        // Vérification si le jour est valide
        if (jour >= 1 && jour <= joursDuMois) {
            System.out.println("Date valide");
        } else {
            System.out.println("Date invalide (jour incorrect)");
        }

        scanner.close();
    }
}