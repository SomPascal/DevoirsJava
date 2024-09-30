package TD2;

import java.util.Scanner;

public class TD2Exo3p1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double nbre;

        System.out.print("Entrez un nombre: ");
        nbre = scanner.nextDouble();

        scanner.close();
        System.out.println((nbre >= 0) ? "\nCe nombre est positif" : "\nCe nombre est négatif");
    }
}
