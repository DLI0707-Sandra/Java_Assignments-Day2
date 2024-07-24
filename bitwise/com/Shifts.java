package bitwise.com;

import java.util.Scanner;

public class Shifts
{
    public static void main(String [] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int result=0;
        int num2=2;
        while(num>0)
        {
            if((num&1)!=0)
            {
                result=result+num2;
            }
            num2=num2<<1;
            num=num>>1;
        }
        System.out.println(result);
    }
}
