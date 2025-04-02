package Java_Code_Programs;

public class Prg18_Factorial_number {
    public static void main(String[]args){
        int num = 5;
        int factorial = 1;
        for(int i = 1;i<=num;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
