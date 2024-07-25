package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings:");
        String word1=sc.next();
        String word2=sc.next();
        char[] char1=word1.toCharArray();
        char[] char2=word2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.compare(char1,char2)==0)
        {
            System.out.println("Anagram.");
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }
}
