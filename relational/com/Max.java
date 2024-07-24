package relational.com;

import java.util.Scanner;

public class Max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter three numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        int largest;
        if(num1>num2)
        {
            if(num1>num3)
                largest=num1;
            else
                largest=num3;
        }
        else
        {
            if(num2>num3)
                largest=num2;
            else
                largest=num3;
        }
        System.out.println("Largest of the three numbers:"+largest);
    }
}
