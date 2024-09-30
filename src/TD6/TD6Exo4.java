package TD6;

import java.util.Scanner;

public class TD6Exo4
{
    public static void main(String[] args)
    {
        double num;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            System.out.printf("Entrez le %de nombre: ", i+1);
            num = scanner.nextDouble();

            System.out.printf("Le carré de %f est %f\n", num, num*num);
        }
        scanner.close();
    }
}
