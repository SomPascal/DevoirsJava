package TD1;
import java.util.Scanner;

public class TD1Exo2p2 
{    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double nbre;

        System.out.print("Entrez un nombre: ");
        nbre = scanner.nextDouble();

        System.out.println("Le double de " + nbre + " est: " + nbre*nbre);

        scanner.close();
    }
}
