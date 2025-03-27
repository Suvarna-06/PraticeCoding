package Java_Code_Programs;

import java.util.Scanner;

public class Prg5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char  ch = sc.next().charAt(0);

        if (ch =='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+" is a vowel");
        } else if ((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')) {
            System.out.println(ch+" is a consonent");
        }
        else {
            System.out.println("Not a alphabhetic character");
        }
    }
}
