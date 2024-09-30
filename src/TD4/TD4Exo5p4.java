package TD4;

import java.util.Scanner;

public class TD4Exo5p4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int nbre;

        System.out.print("Entrez un nombre: ");
        nbre = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nbre + " x " + i + " = " + nbre*i);
        }
    }
}
