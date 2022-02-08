package day5assignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        System.out.println();
        findeven();
    }
    public static void findeven() {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        num=s.nextInt();
        if(num%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
