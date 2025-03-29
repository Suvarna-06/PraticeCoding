package Java_Code_Programs;

public class Prg11_Revere_string {
    //Reverse a String
    //Input - s = abc
    //O/P-  s = cba


    public static void main(String[]args){

        String s= "Sandhya";
        String reversed_string ="";
        char ch;

        for(int i =0;i<s.length();i++){
            ch= s.charAt(i);
            reversed_string =ch+reversed_string;

        }
        System.out.println(reversed_string);

    }
}
