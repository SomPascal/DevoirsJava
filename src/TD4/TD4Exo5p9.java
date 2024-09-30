package TD4;

import java.util.Scanner;

public class TD4Exo5p9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sommeDue = 0;
        int prix;

        // Lire les prix des articles
        do {
            System.out.print("Entrez le prix de l'article (0 pour terminer) : ");
            prix = scanner.nextInt();
            sommeDue += prix;
        } while (prix != 0);

        System.out.println("Le total dû est : " + sommeDue + " euros");

        // Lire la somme payée par le client
        System.out.print("Entrez la somme que vous payez : ");
        int sommePayee = scanner.nextInt();

        // Calculer la monnaie à rendre
        int monnaie = sommePayee - sommeDue;

        if (monnaie > 0) {
            System.out.println("La monnaie à rendre est de : " + monnaie + " euros");

            // Remettre la monnaie en coupures de 10 euros
            while (monnaie >= 10) {
                System.out.println("10 Euros");
                monnaie -= 10;
            }

            // Remettre la monnaie en coupures de 5 euros
            while (monnaie >= 5) {
                System.out.println("5 Euros");
                monnaie -= 5;
            }

            // Remettre la monnaie en pièces de 1 euro
            while (monnaie >= 1) {
                System.out.println("1 Euro");
                monnaie -= 1;
            }
        } else if (monnaie == 0) {
            System.out.println("Aucune monnaie à rendre.");
        } else {
            System.out.println("Le montant payé est insuffisant.");
        }

        scanner.close();
    }
}
