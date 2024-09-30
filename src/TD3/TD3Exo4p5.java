package TD3;

import java.util.Scanner;

public class TD3Exo4p5 
{
    public static void main(String[] args) 
    {
        String sex, msg;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre sex: ");
        sex = scanner.nextLine();

        System.out.println("Entrez votre age: ");
        age = scanner.nextInt();

        scanner.close();

        if (sex == "M" && age > 20) {
            msg = "paie";
        }
        else if (sex == "F" && age >= 18 && age <= 35) {
            msg = "paie";
        }
        else {
            msg = "ne paie pas";
        }

        System.out.println("Il/Elle " + msg + " les impots.");
    }    
}
