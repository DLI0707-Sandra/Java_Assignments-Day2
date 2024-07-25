package strings;

import java.util.Scanner;

public class Substring
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String word=sc.next();
        int maxlength=1;
        String sub=""+word.charAt(0);
        for(int i=1;i<word.length();i++)
        {

                if(sub.indexOf(word.charAt(i))==-1)
                {
                    sub+=word.charAt(i);
                    maxlength=sub.length();
                }
                else
                {
                    sub="";
                }
        }
        System.out.println("The length of the longest substring without repeating characters in a given string:" +maxlength);
    }
}
