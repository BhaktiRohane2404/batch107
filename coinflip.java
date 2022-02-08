package day5assignment;

import java.util.Scanner;

public class coinflip {
    public static void main(String args[]){
        System.out.println();
        calculate();
    }
    public static void calculate() {
        int num;
        float percentHead=0,percentTail=0,headcount=0,tailcount=0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the no. of times to flip coin");
        num = s1.nextInt();
        if(num>0)
        {
            for(int i=0;i<num;i++) {
                double coin = Math.floor((Math.random()*10)%2);
                System.out.println(coin);
                if(coin<0.5)
                    headcount++;
                else
                    tailcount++;
            }
            percentHead = (headcount/num)*100;
            percentTail = (tailcount/num)*100;
            System.out.println("percentage of head "+percentHead);
            System.out.println("percentage of tail "+percentTail);
        }
        else
            System.out.println("Enter positive number only");
    }
}
