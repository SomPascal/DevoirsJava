package TD6;

import java.util.Scanner;
import java.util.Vector;

public class TD6Exo12
{
    public static void main(String[] args)
    {
        int len;
        Vector<Integer> numbers = new Vector<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'element du vecteur: ");
        len = scanner.nextInt();

        for (int i = 0; i < len; i++)
        {
            System.out.printf("Entrez le %se nombre: ", i+1);
            numbers.add(scanner.nextInt() + 1);
        }
        scanner.close();

        System.out.println("Le tableu résultant est: ");
        System.out.println(numbers);
    }
}
