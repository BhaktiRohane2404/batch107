package day5assignment;

import java.util.Scanner;

public class Factor {
    public static void main(String args[]) {
        System.out.println();
        factors();
    }
    public static void factors() {
        int num,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        num=s.nextInt();
        temp=num;
        if(num>0)
        {
            for(int i=2;i<Math.sqrt(num);i++)
            {
                while(temp%i==0) {
                    System.out.println(i+"");
                    temp=temp;
                }
            }
        }
        else
            System.out.println("Enter valid number");
    }

}


