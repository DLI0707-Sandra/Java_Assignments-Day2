package logical.com;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Stopwatch
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String input="";
//        input=sc.next();
        long startsec=0;
        do
        {
            input=sc.next();
            if(Objects.equals(input, "start"))
            {
                Date date=new Date();
                startsec=date.getTime();
//            System.out.println(startsec);
            }

        }while(!Objects.equals(input, "stop"));
        Date date2=new Date();
        long endsec=date2.getTime();
//        System.out.println(endsec);
        System.out.println("Time elapsed="+(endsec-startsec)+"milliseconds");
    }

}
