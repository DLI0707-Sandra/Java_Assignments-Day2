package bitwise.com;

import java.util.Scanner;

public class OddorEven
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if((num&1)==1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
