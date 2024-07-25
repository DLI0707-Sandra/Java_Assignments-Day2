package logical.com;

import java.util.Scanner;

public class Perfect
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= sc.nextInt();
        int[] factors=new int[number];
        int index=0;
        for(int i=1;i<=number/2;i++)
        {
            if(number%i==0)
                factors[index++]=i;
        }
//        for (int i=0;i<index;i++)
//        {
//            System.out.println(factors[i]);
//        }
        int sum=0;
        for (int i=0;i<index;i++)
        {
            sum+=factors[i];
        }

        if(sum==number)
            System.out.println("Perfect number!!");
        else
            System.out.println("Not a perfect number!!");
    }
}
