package stringss;

public class Prg19_WhiteSpace_remove {

    public static void main(String[]args){

        String str = "Geeks for Geeks";

        str = str.replaceAll("\\s","");

        System.out.println("Starting without spaces:"+ str + "'");
    }
}
