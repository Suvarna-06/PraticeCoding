package Java_Code_Programs;

public class Prg15_Interview_Q {
    public static void main(String[]args){

        // Reverse a String

//        String str ="Automation";
//        StringBuilder reversed = new StringBuilder(str).reverse();
//        System.out.println(reversed);

        // Using another method -> 2
        String str = "Automation";
        String rev_string = "";
        char ch;

        for(int i=0;i<str.length();i++){
             ch = str.charAt(i);
             rev_string = ch + rev_string;
        }
        System.out.println(rev_string);
    }
}
