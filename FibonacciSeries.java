package LogicalProblem;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        System.out.println();
        printFibonacci();
    }
    public static void printFibonacci() {
        int num,f1=0,f2=1,f3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        System.out.println(f1+"\t"+f2);
        for(int i=2;i<num;i++) {
            f3=f1+f2;
            System.out.println("\t"+f3);
            f1=f2;
            f2=f3;
        }
    }
}
