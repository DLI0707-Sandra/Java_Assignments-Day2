package ternary.com;

import java.util.Scanner;

public class Min {
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int minimum=num1<num2?num1:num2;
        System.out.println("Smallest of the two is "+minimum);
    }
}
