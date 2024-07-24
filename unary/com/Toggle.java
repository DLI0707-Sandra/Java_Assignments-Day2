package unary.com;

import java.util.Scanner;

public class Toggle
{
    public static void main(String[] args)
    {
        boolean value;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a boolean value:");
        value=sc.nextBoolean();
        value=!value;
        System.out.println("After toggle:"+value);
    }
}
