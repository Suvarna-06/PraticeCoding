package Java_Code_Programs;

import java.util.Scanner;

public class Prg1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a name:");
        String name= sc.nextLine();
        System.out.println("Enter a age:");
        int age = sc.nextInt();
        System.out.println("My name is "+name +" and age is "+age);
    }
}
