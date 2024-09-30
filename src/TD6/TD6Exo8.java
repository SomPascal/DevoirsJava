package TD6;

import java.util.Scanner;

public class TD6Exo8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        int negativeNums = 0;
        int positiveNums = 0;
        double num;

        System.out.print("Combien de nombre voulez vous entrer: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.printf("Entrez le %de nombre: ", i); 
            num = scanner.nextInt();

            if (num >= 0) positiveNums++;
            else negativeNums++;
        }
        scanner.close();

        System.out.printf(
            "%d nombres positif(s) et %d nombre(s) négatif(s)\n", 
            positiveNums,
            negativeNums
        );
    }
}
