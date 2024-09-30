package TD4;

import java.util.Scanner;

public class TD4Exo5p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbre;
        long fact = 1;

        System.out.print("Entrez un nombre: ");
        nbre = scanner.nextInt();

        fact = factorial(nbre);
        
        System.out.println("Le factoriel de " + nbre + " est: " + fact);
        scanner.close();
    }

    public static long factorial(int number)
    {
        long fact = 1;

        for (int i = 1; i < number; i++) 
        {
            fact *= i;
        }

        return fact;
    }
}
