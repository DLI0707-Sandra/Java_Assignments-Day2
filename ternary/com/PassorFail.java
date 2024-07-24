package ternary.com;

import java.util.Scanner;

public class PassorFail
{
    public static void main(String[] args)
    {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        marks=sc.nextInt();
        System.out.println(marks>50?"Pass":"Fail");
    }
}
