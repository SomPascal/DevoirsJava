package TD4;

import java.util.Scanner;

public class TD4Exo5p10 
{
    public static void main(String[] args) 
    {
        int n, p;
        double X, Y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de cheveaux: ");
        n = scanner.nextInt();

        System.out.println("Entrez le nombre de cheveaux joués: ");
        p = scanner.nextInt();

        scanner.close();
        X = TD4Exo5p6.factorial(n) / TD4Exo5p6.factorial(n-p);
        Y = TD4Exo5p6.factorial(n) / (TD4Exo5p6.factorial(p)*TD4Exo5p6.factorial(n-p));

        System.out.println("Dans l'ordre, vous avez 1 chance sur " + X + " de gagner.");
        System.out.println("Dans le désordre, vous avez 1 chance sur " + Y + " de gagner.");

    }
}
