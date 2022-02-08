package day5assignment;

import java.util.Scanner;

public class VowelCons {
    public static void main(String args[]) {
        System.out.println();
        findvowel();
    }
    public static void findvowel() {
        char vowel[]= {'a','e','i','o','u','A','E','I','O','U'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a character: ");
        char c = sc.next().charAt(0);
//        prints the character
        System.out.println("You have entered "+c);
        for(int i=0;i<10;i++)
        {
            if(c==vowel[i]) {
                System.out.println("vowel");
                System.exit(0);
            }
        }
        System.out.println("consonant");
    }
}
