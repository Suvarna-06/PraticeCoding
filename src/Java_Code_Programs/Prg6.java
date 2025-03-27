package Java_Code_Programs;

public class Prg6 {
    public static void main(String[]args){
        int a =5, b =6,c =9;
        int large_three =(a>b)? ((a>c)?a:c):((b>c)?b:c);
        System.out.println(large_three);
    }
}
