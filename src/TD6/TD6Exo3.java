package TD6;

import java.util.Scanner;
import java.util.Vector;

public class TD6Exo3 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Vector<Double> notes = new Vector<>();

        for (int i = 1; i <= 9; i++)
        {
            System.out.printf("Entrez la %de note: ", i);
            notes.add(scanner.nextDouble());
        }
        scanner.close();

        System.out.println(notes.getLast());
    }
}
