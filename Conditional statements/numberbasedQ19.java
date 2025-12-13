import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prd=a*b;
        if(prd>0){
            System.out.println("Positive");
        }
        else
            System.out.println("Negative");
    }
}
