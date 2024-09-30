package TD2;

import java.util.Scanner;

public class TDExo3p6 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int age;
        String categorie;

        System.out.print("Entrez l'age: ");
        age = scanner.nextInt();

        scanner.close();

        if (age >= 6 && age <= 7) {
            categorie = "Poussin";
        }
        else if (age > 7 && age <= 9) {
            categorie = "Pupille";
        }
        else if (age >= 10 && age <= 11) {
            categorie = "Minime";
        }
        else if (age > 11) {
            categorie = "Cadet";
        }
        else {
            categorie = "no category";
        }

        System.out.println("Votre enfant est un " + categorie);
    }
}
