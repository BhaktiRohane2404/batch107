package LogicalProblem;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String args[]) {
        System.out.println();
        Findperfect();
    }
    public static void Findperfect() {
        int num,sum=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
            if(num%i==0) {
                sum+=i;
            }
        System.out.println(sum);
        if(sum==num) {
            System.out.println("perfect number");
        }
        else
            System.out.println("not perfect");

    }
}
