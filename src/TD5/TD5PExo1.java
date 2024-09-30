package TD5;

import java.util.Scanner;

public class TD5PExo1 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x1, x2, x3, x4, x5;

        System.out.println("Entrez le nombre 1: ");
        x1 = scanner.nextInt();
        
        System.out.println("Entrez le nombre 2: ");
        x2 = scanner.nextInt();

        System.out.println("Entrez le nombre 3: ");
        x3 = scanner.nextInt();
        
        System.out.println("Entrez le nombre 4: ");
        x4 = scanner.nextInt();
        
        System.out.println("Entrez le nombre 5: ");
        x5 = scanner.nextInt();

        scanner.close();

        System.out.println("La somme de ces nombres est: " + sum(x1, x2, x3, x4, x5));
    }

    public static int sum(int x1, int x2, int x3, int x4, int x5)
    {
        return x1 + x2 + x3 + x4 + x5;
    }
}
