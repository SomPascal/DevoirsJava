package TD4;

import java.util.Scanner;

public class TD4Exo5p5 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int nbre;
        int sum = 0;

        System.out.print("Entrez un nombre: ");
        nbre = scanner.nextInt();

        for (int i = 1; i <= nbre; i++) 
        {
            sum += i;
        }
        scanner.close();

        System.out.println("La somme = " + sum);

    }
}
