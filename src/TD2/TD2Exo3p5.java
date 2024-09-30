package TD2;

import java.util.Scanner;

public class TD2Exo3p5 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double nbre1, nbre2;
        String msg;

        System.out.print("Entrez le 1er nombre: ");
        nbre1 = scanner.nextDouble();

        System.out.print("Entrez le 2e nombre: ");
        nbre2 = scanner.nextDouble();

        scanner.close();

        if ((nbre1 > 0 && nbre2 > 0) || (nbre1 < 0 && nbre2 < 0)) 
        {
            msg = "positif.";
        }
        else if (nbre1 == 0 && nbre2 == 0) {
            msg = "nule";
        }
        else {
            msg = "négatif";
        }

        System.out.println("Le produit de " + nbre1 + " et de " + nbre2 + " est : " + msg);
    }
}
