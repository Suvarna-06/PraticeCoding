package Java_Code_Programs;

public class Prg12_Palindrome_string {
    // Input : str = "abba"
    //Output: Yes
    //
    //Input : str = "pramod"
    //Output: No


    public static void main(String[]args){
        String str = "abba";
        String rev ="";
        char ch;
        for(int  i =0; i<str.length();i++){
           ch = str.charAt(i);
           rev = ch+rev;
           if(str.equals(rev)){
               System.out.println("yes");
           }
           else{
               System.out.println("No");
           }
        }
        System.out.println(rev);
    }
}
