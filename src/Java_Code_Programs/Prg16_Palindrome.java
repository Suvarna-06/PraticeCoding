package Java_Code_Programs;

public class Prg16_Palindrome {
    public static void main(String[]args){
    String str = "madam";
    String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
        System.out.println(reversed);

    }
}
