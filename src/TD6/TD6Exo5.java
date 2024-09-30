package TD6;

public class TD6Exo5
{
    public static void main(String[] args)
    {
        int[] N = new int[7];

        for (int i = 0; i <= 6; i++)
        {
            N[i] = 1+2*i;
        }

        for (int j : N)
        {
            System.out.println(j);
        }
    }
}
