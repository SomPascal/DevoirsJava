package TD2;

import java.util.Scanner;

public class TD2Exo3p4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double nbre;

        System.out.println("Entrez un nombre: ");
        nbre = scanner.nextDouble();

        scanner.close();

        if (nbre > 0) {
            System.out.println("positif");
        }
        else if (nbre == 0) {
            System.out.println("nule");
        }
        else {
            System.out.println("négatif");
        }
    }
}
