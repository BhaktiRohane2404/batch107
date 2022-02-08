package day5assignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        System.out.println();
        findleap();
    }
    public static void findleap() {
        int count=0,year,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year");
        year=s.nextInt();
        temp=year;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        if(count==4 && year>0)
        {
            if((year%4==0) && (year%100!=0) || (year%400==0))
                System.out.println("leap year");
            else
                System.out.println("not leap year");
        }
        else
            System.out.println("Enter valid year");
    }
}
