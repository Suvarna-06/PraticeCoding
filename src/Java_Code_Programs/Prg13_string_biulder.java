package Java_Code_Programs;

public class Prg13_string_biulder {
    public static void main(String[]args)
    {
        // Reverse string
    String st = "Sandhya is owner of her life";
    StringBuilder st1 = new StringBuilder();
    st1.append(st);
    st1.reverse();
        System.out.println(st1);
    }
}
