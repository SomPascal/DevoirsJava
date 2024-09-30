package TD4;

import java.util.Scanner;

public class TD4Exo5p2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int nbre;

        while (true) 
        {
            System.out.print("\nEntrez un nombre entre 10 et 20: ");
            nbre = scanner.nextInt();
            
            if (nbre >= 10 && nbre <= 20) 
            {
                break;
            }
            System.out.println("Veuillez entrer un nombre entre 10 et 20");
        }

        scanner.close();
        System.out.println("Good !");
    }
}
