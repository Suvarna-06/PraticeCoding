package stringss;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[]args){
        String a ="listen";
        String b = "silent";

        char[] arr1 =a.toCharArray();
        char[] arr2 = a.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}
