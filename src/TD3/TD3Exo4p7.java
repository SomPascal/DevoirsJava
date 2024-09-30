package TD3;

import java.util.Scanner;

public class TD3Exo4p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des informations du conducteur
        System.out.print("Quel est votre âge ? ");
        int age = scanner.nextInt();

        System.out.print("Depuis combien d'années avez-vous votre permis ? ");
        int anneePermis = scanner.nextInt();

        System.out.print("Combien d'accidents avez-vous provoqués ? ");
        int nombreAccidents = scanner.nextInt();

        System.out.print("Depuis combien d'années êtes-vous client chez nous ? ");
        int ancienneteClient = scanner.nextInt();

        // Initialiser la variable pour le tarif
        String tarif = "Refusé";

        // Traitement des différentes situations
        if (age < 25 && anneePermis < 2) {
            // Moins de 25 ans et permis depuis moins de 2 ans
            if (nombreAccidents == 0) {
                tarif = "Rouge";
            }
        } else if ((age < 25 && anneePermis >= 2) || (age >= 25 && anneePermis < 2)) {
            // Moins de 25 ans et permis depuis plus de 2 ans
            // OU plus de 25 ans avec permis depuis moins de 2 ans
            if (nombreAccidents == 0) {
                tarif = "Orange";
            } else if (nombreAccidents == 1) {
                tarif = "Rouge";
            }
        } else if (age >= 25 && anneePermis >= 2) {
            // Plus de 25 ans avec permis depuis plus de 2 ans
            if (nombreAccidents == 0) {
                tarif = "Vert";
            } else if (nombreAccidents == 1) {
                tarif = "Orange";
            } else if (nombreAccidents == 2) {
                tarif = "Rouge";
            }
        }

        // Appliquer la fidélité
        if (!tarif.equals("Refusé") && ancienneteClient > 1) {
            switch (tarif) {
                case "Rouge":
                    tarif = "Orange";
                    break;
                case "Orange":
                    tarif = "Vert";
                    break;
                case "Vert":
                    tarif = "Bleu";
                    break;
            }
        }

        // Affichage du résultat
        System.out.println("Votre tarif d'assurance est : " + tarif);

        scanner.close();
    }
}