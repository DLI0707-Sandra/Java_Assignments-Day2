package multiplication.com;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number :");
        number=sc.nextInt();
        System.out.println("Multiplication Table for "+number);
        for(int i=0;i<10;i++)
        {
            System.out.println(number+"*"+(i+1)+"="+(number*(i+1)));
        }
    }
}
