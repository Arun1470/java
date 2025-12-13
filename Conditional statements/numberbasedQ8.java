import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int str=a%10;
        if(str%3==0){
            System.out.println("Yes");
        }
        else
            System.out.println("NO");
    }
}
