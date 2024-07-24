package additionandsubtraction.com;

import java.util.Scanner;

public class Test {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        int sum,diff;
        System.out.println("Enter 1st number");
        num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        num2=sc.nextInt();
        sum=num1+num2;
        diff=num1-num2;
        System.out.println("Sum="+sum);
        System.out.println("Difference="+diff);


    }
}
