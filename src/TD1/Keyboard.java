package TD1;
import java.util.Scanner;

public class Keyboard {
    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt)
    {
        System.out.print(prompt);

        int res = scanner.nextInt();

        return res;
    }

    public static double readDouble(String prompt)
    {
        System.out.print(prompt);

        System.out.println(scanner.hasNextDouble());
        double res = scanner.nextDouble();

        return res;
    }

    public static String readString(String prompt)
    {
        System.out.print(prompt);
        String res = scanner.nextLine();

        return res;
    }
}
