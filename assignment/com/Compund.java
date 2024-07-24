package assignment.com;

import java.util.Scanner;

public class Compund
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(num1+"+="+num2+" is "+(num1+=num2));
        System.out.println(num1+"-="+num2+" is "+(num1-=num2));
        System.out.println(num1+"*="+num2+" is "+(num1*=num2));
        System.out.println(num1+"/="+num2+" is "+(num1/=num2));
        System.out.println(num1+"%="+num2+" is "+(num1%=num2));
    }
}
