package Java_Code_Programs;

import java.util.Scanner;

public class Prg3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc. nextInt();
        if(num% 2 == 0){
            System.out.println(num+" is Even Number");
        }
        else{
            System.out.println(num+" is Odd Number");
        }
    }
}
