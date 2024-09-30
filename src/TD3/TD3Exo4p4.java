package TD3;

import java.util.Scanner;

public class TD3Exo4p4 
{
    public static void main(String[] args) 
    {
        int nbre;
        double facture = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre de photocopies: ");
        nbre = scanner.nextInt();

        scanner.close();

        if (nbre > 10) 
        {
            facture = 10*0.1; 
            nbre -= 10;

            if (nbre > 20) 
            {
               facture += 20*0.09;
               nbre -= 20; 

                facture += nbre*0.08;
            }
            else 
            {
                facture += nbre*0.07;
            }
        }
        else 
        {
            facture = nbre*0.1;
        }

        System.out.println("Votre facture est de: " + facture);
    }
}
