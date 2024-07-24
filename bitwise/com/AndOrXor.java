package bitwise.com;

import java.util.Scanner;

public class AndOrXor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Bitwise AND result:"+(num1&num2));
        System.out.println("Bitwise OR result:"+(num1|num2));
        System.out.println("Bitwise XOR result:"+(num1^num2));
    }
}
