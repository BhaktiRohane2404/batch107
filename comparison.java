package practice;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinate x1");
        int x1 = sc.nextInt();
        System.out.println("Enter co-ordinate y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the co-ordinate x2");
        int x2 = sc.nextInt();
        System.out.println("Enter the co-ordinate y2");
        int y2 = sc.nextInt();
        System.out.println("Enter the co-ordinate x3");
        int x3 = sc.nextInt();
        System.out.println("Enter the co-ordinate y3");
        int y3 = sc.nextInt();
        System.out.println("Enter the co-ordinate x4");
        int x4 = sc.nextInt();
        System.out.println("Enter the co-ordinate y4");
        int y4 = sc.nextInt();
        int i1 = (int) Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        int i2 = (int) Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
        String s1=String.valueOf(i1);
        String s2=String.valueOf(i2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.compareTo(s2));
    }
}
