package strings;

import java.util.Scanner;

public class Frequency
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String word=sc.next();
        char[] chars=word.toCharArray();
        int[] freq=new int[chars.length];

        for(int i=0;i< chars.length;i++)
        {
            freq[i]=1;
            for (int j=i+1;j< chars.length;j++)
            {
                if(chars[j]==chars[i])
                {
                    freq[i]++;
                    chars[j]='-';
                }
            }
        }

        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]!='-')
                System.out.println("Frequency of "+chars[i]+":"+freq[i]);
        }

    }
}
