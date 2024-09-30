package TD3;

import java.util.Scanner;

public class TD3Exo4p3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int h, m, s;

        System.out.print("Entrez l'heure: ");
        h = scanner.nextInt();
        
        System.out.print("Entrez la minute: ");
        m = scanner.nextInt();

        System.out.print("Entrez la seconde: ");
        s = scanner.nextInt();

        scanner.close();

        if (s == 59) {
            s = 0;

            if (m == 59) {
                m = 0;
                h = (h == 23) ? 0 : h+1;
            }
            else {
                m++;
            }
        }
        else {
            s++;
        }

        System.out.println("Il est " + h + ":" + m + ":" + s);

    }
}
