package TD3;

import java.util.Scanner;
import java.util.Vector;

public class TD3Exo4p6 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> scores = new Vector<>();

        int i, score;
        int sum = 0;
        double suff;

        for (i = 0; i < 4; i++) 
        {
            System.out.print("Entrez le score " + (i+1) + " : ");
            score = scanner.nextInt();

            sum += score;
            scores.add(score);
        }

        scanner.close();
        suff = (scores.getFirst() / sum) * 100; 

        if (suff > 50) 
        {
            System.out.println("Il est élu!");
        }
        else if (suff >= 12.5) {
            System.out.println("Il est passé pour le second tour!");
        }
        else {
            System.out.println("Il est éliminé!");
        }
    }
}
