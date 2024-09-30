package TD2;

import java.util.Scanner;

public class TD2Exo3p2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double n, m;

        System.out.println("Entrez un 1e nombre: ");
        n = scanner.nextDouble();

        System.out.println("Entrez un 2e nombre: ");
        m = scanner.nextDouble();

        scanner.close();

        if ((n >= 0 && m >= 0) || (n < 0 && m < 0)) {
            System.out.println("Le produit de " + n + " et " + m + " est positif");
        }
        else {
            System.out.println("Le produit de " + n + " et " + m + " est négatif");
        }
    }
}
