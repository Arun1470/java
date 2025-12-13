import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int str1=a%10;
        int str2=b%10;
        if(str1==str2){
            System.out.println("Same Digit");
        }
        else
            System.out.println("Not Same");
    }
}