package logical.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Coupon
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int distinct=0;
        int count=0;
        int index=0;
        int[]coupon=new int[num];
        for(int i=0;i<num;i++)
        {
            coupon[i]=-1;
        }
        boolean present=false;
        Random r=new Random();
        while(distinct!=num)
        {
            present=false;
            int current= r.nextInt(10);
            System.out.print(current+" ");
            for(int i=0;i<coupon.length;i++)
            {
                if(coupon[i]==current)
                {
                    count++;
                    present=true;
                }
            }
            if(!present)
            {
                coupon[index++]=current;
                distinct++;
                count++;
            }
        }
//        System.out.println(distinct);
        System.out.println("\nNumber of times random number generated to get "+distinct+" numbers:"+count);

    }
}
