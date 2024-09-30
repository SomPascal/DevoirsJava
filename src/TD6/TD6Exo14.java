package TD6;

import java.util.Scanner;
import java.util.Vector;

public class TD6Exo14
{
    public static void main(String[] args)
    {
        int len, note;
        double average;
        int sum = 0;

        Vector<Integer> notes = new Vector<>();
        Vector<Integer> goodNotes = new Vector<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de notes: ");
        len = scanner.nextInt();

        for (int i = 0; i < len; i++)
        {
            System.out.printf("Entrez le %se nombre: ", i+1);
            note = scanner.nextInt();

            sum += note;
            notes.add(note);
        }
        scanner.close();

        average = (double) sum/notes.size();

        for (Integer n : notes)
        {
            if (n >= average)
            {
                goodNotes.add(n);
            }               
        }

        System.out.println("Les meilleures notes sont les suivantes: ");
        System.out.println(goodNotes);
    }
}
