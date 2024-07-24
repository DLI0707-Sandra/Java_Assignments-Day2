package unary.com;

import java.util.Scanner;

public class PostandPre
{
    public static void main(String[] args)
    {
        int result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        result=number++;
        System.out.println("After post increment:");
        System.out.println("result="+result);
        System.out.println("number="+number);

        result=++number;
        System.out.println("After pre increment:");
        System.out.println("result="+result);
        System.out.println("number="+number);

    }
}
