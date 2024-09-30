package TD6;

import java.util.Vector;

public class TD6Exo10 
{
    public static void main(String[] args) 
    {
        Vector<Integer> newTab = new Vector<>();
        int[] tab1 = {4, 8, 7, 9, 1, 5, 4, 6};
        int[] tab2 = {7, 6, 5, 2, 1, 3, 7, 4};

        for (int i = 0; i < tab2.length; i++)
        {
            newTab.add(tab1[i] + tab2[i]);
        }
        
        System.out.println(newTab);
    }
}
