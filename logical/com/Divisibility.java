package logical.com;

import java.util.Scanner;

public class Divisibility
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int number=sc.nextInt();
        if(number%5==0&&number%7==0)
        {
            System.out.println("The number is divisible by 5 and 7.");
        }
        else
            System.out.println("Not divisible.");
    }
}
