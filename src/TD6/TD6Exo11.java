package TD6;

public class TD6Exo11 
{
    public static void main(String[] args)
    {
        int[] tab1 = {4, 8, 7, 12};
        int[] tab2 = {3, 6};
        long schtroumpf = 0;

        for (int i = 0; i < tab2.length; i++) 
        {
            for (int j = 0; j < tab1.length; j++) 
            {
                schtroumpf += tab1[j] * tab2[i];
            }
        }

        System.out.printf("Le schtroumpf de ces tableau est: %s\n", schtroumpf);
    }
}
