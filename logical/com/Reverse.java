package logical.com;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= sc.nextInt();
        int reverse=0;
        int pos=0;
        int n=number;
        while (n!=0)
        {
            n=n/10;
            pos++;
        }
        while(number!=0)
        {
            int rem=number%10;
            reverse+=(rem*pow(10,pos-1));
            pos--;
            number=number/10;
        }
        System.out.println("Reverse of the number:"+reverse);
    }
}
