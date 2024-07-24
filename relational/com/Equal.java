package relational.com;

import java.util.Scanner;

public class Equal
{
    public static void main(String[] args)
    {
        String input1;
        String input2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st String:");
        input1=sc.nextLine();
        System.out.println("Enter 2nd String:");
        input2=sc.nextLine();
        if(input1.equals(input2))
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");

    }
}
