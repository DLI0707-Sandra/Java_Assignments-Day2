package logical.com;

import java.util.Scanner;

public class Prime
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= sc.nextInt();
        boolean prime=true;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                System.out.println("Not Prime!");
                prime=false;
                break;
            }
        }
        if(prime)
            System.out.println("Prime number!");
    }
}
