package TD4;

import java.util.Scanner;
import java.util.Vector;

public class TD4Exo5p8 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();
        int num, n;

        System.out.print("Combien de nombres voulez-vous entrer: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            System.out.print("Entrez le " + i + "e nombre: ");
            num = scanner.nextInt();
            numbers.add(num);
        }
        
        scanner.close();
        numbers.sort(null);
        System.out.println(numbers.getLast());

    }
}
