package TD4;

import java.util.Scanner;

public class TD4Exo5p1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int nbre;

        while (true) 
        {
            System.out.print("\nEntrez un nombre entre 1 et 3: ");
            nbre = scanner.nextInt();

            if (nbre >= 1 && nbre <= 3) 
            {
                break;
            }
            System.out.println("Le nom doit etre entre 1 et 3.");
        }

        System.out.println("Good!");
        scanner.close();
    }
}
