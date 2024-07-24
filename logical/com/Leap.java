package logical.com;

import java.util.Scanner;

public class Leap
{
    public static void main(String[] args) {
        int year;
        Scanner so = new Scanner(System.in);
        System.out.println("Enter the year to be checked:");
        year = so.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
    }
}
