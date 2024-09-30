package TD6;

import java.util.Scanner;
import java.util.Vector;

public class TD6Exo13
{
    public static void main(String[] args)
    {
        int len, biggest, biggestIndex;
        Vector<Integer> numbers = new Vector<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'element du vecteur: ");
        len = scanner.nextInt();

        for (int i = 0; i < len; i++)
        {
            System.out.printf("Entrez le %se nombre: ", i+1);
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        biggest = numbers.getFirst();
        biggestIndex = 0;
         
        for (int j=0; j < numbers.size(); j++) 
        {
            if (numbers.get(j) > biggest) 
            {
                biggest = numbers.get(j);
                biggestIndex = j;
            }
        }

        System.out.printf(
            "Le plus grand nombre est %d et il est à la %de position",
            biggest,
            biggestIndex + 1
        );
    }
}
