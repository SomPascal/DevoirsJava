package TD3;

import java.util.Scanner;

public class TD3Exo4p2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int h, m;

        System.out.print("Entrez l'heure: ");
        h = scanner.nextInt();

        System.out.print("Entrez la minute: ");
        m = scanner.nextInt();

        scanner.close();

        if (m == 59) {
            m = 0;
            h = (h == 23) ? 0 : h+1;
        }
        else {
            m++;
        }
        System.out.println("Dans une minute il sera: " + h + ":" + m);


    }
}
