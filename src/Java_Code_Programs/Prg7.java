package Java_Code_Programs;

import java.util.Scanner;

public class Prg7 {
    public static void main(String[]args){
    /*
    Convert Days into Years, Months, and Days.
        ->Take the Days Input from the User
     Define the conversion logic:
        :- Assume 1 year = 365 days.
        :- Assume 1 month = 30 days
        Convert the Days into Years, Month and days and Print it.
   if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Day:");
        int total_day = sc.nextInt();
        int year = total_day / 365;
        int remaning_days_after_year =total_day % 365;
        int months = remaning_days_after_year / 30;
        int days = remaning_days_after_year % 30;
        System.out.println(year+" year" + months+" months"+ total_day+" days");










    }










    }

