public class Solution
{
    public static int i;

    public static void Solve(String [] str)
    {
        String str1[] = new String[10];
              str1[0] = "acbaad";
        int count = 0;
        for (i = 0; i < 5; i++)
        {
            if (str1[0].charAt(i) == str[i].charAt(0))
                count++;
        }
        System.out.println(count);
    }
}
