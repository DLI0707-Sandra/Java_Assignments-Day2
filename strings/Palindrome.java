package strings;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String word=sc.next();
        String wordrev="";

        for(int i=word.length()-1;i>=0;i--)
        {
            wordrev+=word.charAt(i);
        }

        if(word.equals(wordrev))
        {
            System.out.println("Palindrome!");
        }
        else
        {
            System.out.println("Not a palindrome!");
        }
    }
}
