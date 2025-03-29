package Java_Code_Programs;

import java.util.logging.SocketHandler;

public class Prg9 {
    public static void main(String[]args){
        String s1 = "Hello";
        String s2="Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s1));
        System.out.println(s2.equals(s2));
        System.out.println(s2.equalsIgnoreCase(s5));
    }
}

